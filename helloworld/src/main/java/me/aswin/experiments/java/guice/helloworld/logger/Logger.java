package me.aswin.experiments.java.guice.helloworld.logger;

public interface Logger {

    public void debug(String message, Object... args);

    public void info(String message, Object... args);

    public void warn(String message, Object... args);

    public void error(String message, Object... args);

    public void error(String message, Throwable throwable);

}