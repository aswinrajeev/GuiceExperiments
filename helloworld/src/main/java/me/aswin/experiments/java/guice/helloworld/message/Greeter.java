package me.aswin.experiments.java.guice.helloworld.message;

import com.google.inject.Inject;

public class Greeter {

    Message message;

    @Inject
    public Greeter(final Message message) {
        this.message = message;
        System.out.println("Initializing greeter");
    }

    public void greet() {
        System.out.println("Greeting...");
        System.out.println(String.format("Greet: %s", message.getMessage()));
    }
}
