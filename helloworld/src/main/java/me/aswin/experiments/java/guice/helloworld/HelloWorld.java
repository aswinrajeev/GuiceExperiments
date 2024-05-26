package me.aswin.experiments.java.guice.helloworld;

import com.google.inject.Inject;

import me.aswin.experiments.java.guice.helloworld.logger.Logger;
import me.aswin.experiments.java.guice.helloworld.message.Greeter;

public class HelloWorld {

    Greeter greeter;
    Logger log;

    @Inject
    public HelloWorld(Greeter greeter, Logger logger) {
        this.log = logger;
        this.greeter = greeter;
        log.debug("Initialising greeter...");
    }

    public void start() {
        log.debug("Passing control over to greeter...");
        greeter.greet();
    }

}
