package me.aswin.experiments.java.guice.helloworld;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import me.aswin.experiments.java.guice.helloworld.message.Greeter;
import me.aswin.experiments.java.guice.helloworld.message.Message;

public final class HelloWorldModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Greeter.class);
    }

    @Provides
    Message provideMessage() {
        return new Message("Hello World", 0);
    }
}
