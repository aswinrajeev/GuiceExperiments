package me.aswin.experiments.java.guice.helloworld.message;

import com.google.inject.Inject;

import me.aswin.experiments.java.guice.helloworld.logger.Logger;

public class Greeter {

    Message message;

    private Logger log;

    @Inject
    public Greeter(final Message message, Logger logger) {
        this.message = message;
        this.log = logger;
        log.debug("Initializing greeter...");
    }

    public void greet() {
        log.debug("Greeting...");
        System.out.println(message.getMessage());
    }
}
