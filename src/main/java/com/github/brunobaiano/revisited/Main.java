package com.github.brunobaiano.revisited;

import com.github.brunobaiano.model.User;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Create a user input with invalid data
        User user = new User("Brun", "bruno@javatips", "pass");

        UserValidators.getValidationRules().stream()
                .map(rule -> rule.apply(user)).filter(Objects::nonNull).reduce((a, b) -> a + "\n" + b)
                .ifPresentOrElse(System.out::println, () -> System.out.println("User input is valid."));

    }
}