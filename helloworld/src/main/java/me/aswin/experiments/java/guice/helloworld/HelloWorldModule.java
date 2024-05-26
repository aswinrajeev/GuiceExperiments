package me.aswin.experiments.java.guice.helloworld;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;

import me.aswin.experiments.java.guice.helloworld.annotations.ConsoleLogger;
import me.aswin.experiments.java.guice.helloworld.logger.Logger;
import me.aswin.experiments.java.guice.helloworld.logger.StdOutLogger;
import me.aswin.experiments.java.guice.helloworld.message.Greeter;
import me.aswin.experiments.java.guice.helloworld.message.Message;

public final class HelloWorldModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Greeter.class);
        bind(Logger.class).annotatedWith(ConsoleLogger.class).to(StdOutLogger.class);
    }

    @Provides
    Message provideMessage() {
        return new Message("Hello World!", 0);
    }

    @Provides
    Logger provideStdOutLogger(@ConsoleLogger Logger logger) {
        logger.debug("Initializing logger...");
        return logger;
    }
}
