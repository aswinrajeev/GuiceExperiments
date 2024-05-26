package me.aswin.experiments.java.guice.helloworld.logger;

import lombok.NoArgsConstructor;
import me.aswin.experiments.java.guice.helloworld.annotations.ConsoleLogger;

@NoArgsConstructor
public class StdOutLogger implements Logger {

    @Override
    public void debug(String message, Object... args) {
        System.out.println(String.format("[DEBUG] " + message, args));
    }

    @Override
    public void info(String message, Object... args) {
        System.out.println(String.format("[INFO] " + message, args));
    }

    @Override
    public void warn(String message, Object... args) {
        System.out.println(String.format("[WARN] " + message, args));
    }

    @Override
    public void error(String message, Object... args) {
        System.out.println(String.format("[ERROR] " + message, args));
    }

    @Override
    public void error(String message, Throwable throwable) {
        System.out.println("[DEBUG] " + message);
        throwable.printStackTrace();
    }

}
