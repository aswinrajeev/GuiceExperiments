package me.aswin.experiments.java.guice.helloworld;

import com.google.inject.Inject;

import me.aswin.experiments.java.guice.helloworld.message.Greeter;

public class HelloWorld {

    Greeter greeter;

    @Inject
    public HelloWorld(Greeter greeter) {
        this.greeter = greeter;
    }

    public void start() {
        greeter.greet();
    }

}
