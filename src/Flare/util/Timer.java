package Flare.util;

public class Timer {
    static long startTime;
    static long endTime;
    static long timeElapsed;

    public static void start() { startTime = System.currentTimeMillis(); }
    public static void stop() {
        endTime = System.currentTimeMillis();
        timeElapsed = (endTime - startTime);
    }
    public static long getElapsed() { return timeElapsed; }
}
