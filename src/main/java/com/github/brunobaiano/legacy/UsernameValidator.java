package com.github.brunobaiano.legacy;

import com.github.brunobaiano.model.User;

public class UsernameValidator extends UserValidatorDecorator {
    public UsernameValidator(UserInputValidator validator) {
        super(validator);
    }
    @Override
    public boolean validate(User user) {
        if (user.username() == null || user.username().length() < 5) {
            System.out.println("Invalid username: must be at least 5 characters long.");
            return false;
        }
        return decoratedValidator.validate(user); // Proceed to the next validation
    }
}
