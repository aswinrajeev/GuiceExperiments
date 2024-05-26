package me.aswin.experiments.java.guice.helloworld.message;

import com.google.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Message {
    private String message;
    private int priority;
}
