package com.github.brunobaiano.legacy;

import com.github.brunobaiano.model.User;

public class MainLegacy {
    public static void main(String[] args) {

        User user = new User("Bruno", "bruno@javatips", "pass");

        // Create a validation chain using the decorator pattern
        UserInputValidator validator = new EmailValidator(new UsernameValidator(new AlwaysValid()));

        // Validate user input
        boolean isValid = validator.validate(user);
        if (isValid) {
            System.out.println("User input is valid.");
        } else {
            System.out.println("User input is invalid.");
        }
    }
}