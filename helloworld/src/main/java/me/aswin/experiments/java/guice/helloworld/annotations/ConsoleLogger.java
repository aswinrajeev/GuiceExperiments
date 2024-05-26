package me.aswin.experiments.java.guice.helloworld.annotations;

import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD, TYPE })
@Retention(RUNTIME)
public @interface ConsoleLogger {
}
