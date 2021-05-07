## <a id="section1"></a> Translating entities and components

During the design of Flare, it was important that the resulting semantics could be easily translated to an equivalent C++
implementation while still keeping relevant DOP designs.

Converting entity declarations to C++ is quite straightforward. Each primitive component can be expressed as a vector so
that the data can arranged as close together as possible:

<table>
<tr>
<th>Flare</th>
<th>C++</th>
</tr>
<tr>
<td>

```
entity Vector3 {
    component {
        float x, y, z;
    }
}
```

</td>
<td>

```cpp
typedef struct Vector3 {
    std::vector<int> Vector3_x, Vector3_y, Vector3_z;
} Vector3;
```

</td>
</tr>
<tr>
<td>

```
entity Quaternion {
    component {
        float x, y, z, w;
    }
}
```

</td>
<td>

```cpp
typedef struct Quaternion {
    std::vector<int> Quaternion_x, Quaternion_y, Quaternion_z, Quaternion_w;
} Quaternion;
```

</td>
</tr>
</table>

### <a id="section1.1"></a> User-declared components and importing entity's components

For entities that are comprised of other entities, the process is a bit more tricky. One possible solution is to implement user-declared
components as a vector of structs for more comprehensible accessing later down the transpilation process. However, that falls into the 
AoS structure that we initially wanted to avoid. So, Flare "imports" its component's components:

<table>
<tr>
<th>Flare</th>
<th>C++</th>
</tr>
<tr>
<td>

```
entity Transform {
    component {
        int id;
        Vector3 position, scale;
        Quaternion rotation;
    }
}
```

</td>
<td>

```cpp
typedef struct Transform {
    std::vector<int> Transform_id;
    std::vector<float> Vector3_x, Vector3_y, Vector3_z;
    std::vector<float> Quaternion_x, Quaternion_y, Quaternion_z, Quaternion_w;
} Transform;
```

</td>
</tr>
</table>

This process happens recursively as the transpiler can go through complex entities that are comprised of many nested entities.

Note that despite `Transform` having two `Vector3` components, the translation implements them as if it where only one component.
This is done since we can still accommodate both `Transform.position` and `Transform.scale` into the same vector
array; all that is needed to get the appropriate values is for some clever indexing.

## <a id="section2"></a> Component Allocation

Before any entity can be initialized with values and manipulated, we must allocate the correct amount of space.

In addition to generating typedef structs for an entity, the transpiler also writes an `allocate()` function taking in the entity in question 
and the size of the set:

<table>
<tr>
<th>C++</th>
</tr>
<tr>
<td>

```cpp
template <typename A>
void Vector3_allocate(A entity, int size)
{
    entity->Vector3_x = std::vector<float>(size * 1, 0.0);
    entity->Vector3_y = std::vector<float>(size * 1, 0.0);
    entity->Vector3_z = std::vector<float>(size * 1, 0.0);
}
```

</td>
</tr>
</table>

Flare does not allow for null values and when allocating the appropriate size, so a default value is set when initializing the vectors. The following are 
the default values for each primitive type in Flare:

Primitive Type | Default Type
--- | --- 
int | 0
short | 0
long | 0
byte | 0
float | 0.0
double | 0.0
char | ' '
string | ""
boolean | false

For complex entities that are comprised of other entities, the code implementation can simplified by just calling the component's `allocate()` method:

<table>
<tr>
<th>C++</th>
</tr>
<tr>
<td>

```cpp
template <typename A>
void Transform_allocate(A entity, int size)
{
    entity->Transform_id = std::vector<int>(size * 1, 0);
    Vector3_allocate(entity, size * 2);
    Quaternion_allocate(entity, size * 1);
}
```

</td>
</tr>
</table>

Notice that the `Vector3_allocate()` is being allocated twice the size of the Transform entity to accommodate the `Trasform.position` and `Trasnform.scale` components
into the same vector.

## <a id="section3"></a> Functions and Function calls

An example of a constructor and its translated equivalent:

<table>
<tr>
<th>Flare</th>
<th>C++</th>
</tr>
<tr>
<td>

```
public Vector3(float x, float y, float z) {
    this.x(x);
    this.y(y);
    this.z(z);
}
```

</td>
<td>

```cpp
template <typename Vector30, typename Vector31, typename Vector32, typename Vector33>
Vector30 Vector3_ctor(Vector30 entity, int start, int end, const Vector31& m_x, const Vector32& m_y, const Vector33& m_z)
{
    for (int iter = std::abs(end - start) * 0; iter < std::abs(end - start) * 1; iter++)
        entity->Vector3_x[start + iter] = m_x(iter);
    for (int iter = std::abs(end - start) * 0; iter < std::abs(end - start) * 1; iter++)
        entity->Vector3_y[start + iter] = m_y(iter);
    for (int iter = std::abs(end - start) * 0; iter < std::abs(end - start) * 1; iter++)
        entity->Vector3_z[start + iter] = m_z(iter);
    return entity;
}
```

</td>
</tr>
</table>

The `entity` parameter is quite versatile as we can simply pass a Vector3 struct or any entity that implements a Vector3 component into the same constructor. We can confidently do this since,
looking at `Vector3_ctor`, entities being passed only need to have the appropriate `Vector3_x`, `Vector3_y`, and `Vector3_z` variables. These vectors are guaranteed to be included in the struct
since [entities import their component's components](#section1.1). This also means that all entities are compatible with their component's functions.

Function parameters in Flare are translated as template variables which allows passing in lambda operators to the function. This has the benefit of simply passing in any iterator value from a for-loop
into the lambda variable and get the expected result.

To call constructors or any function for that matter, the transpiler converts each parameter into a lambda function where it takes in an `int iter` argument. The parameter is an intentionally 
called iter in order to simplify writing the function parameters into the lambda body without any alterations.


<table>
<tr>
<th>Flare</th>
<th>C++</th>
</tr>
<tr>
<td>

```
void main() {
    Vector3 vec(iter, iter + 1, iter * 10);
}
```

</td>
<td>

```cpp
int main()
{
    auto m_vec = new Vector3();
    Vector3_allocate(m_vec, std::abs(1 - 0));
    Vector3_ctor(m_vec, 0, 1, [&](int iter) { return iter; }, [&](int iter) { return iter + 1; }, [&](int iter) { return iter * 10; });
    return 0;
}
```

</td>
</tr>
</table>