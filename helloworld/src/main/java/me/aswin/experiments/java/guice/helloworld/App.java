package me.aswin.experiments.java.guice.helloworld;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloWorldModule());
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.start();
    }
}
