package com.github.brunobaiano.legacy;

import com.github.brunobaiano.model.User;

public class EmailValidator extends UserValidatorDecorator {
    public EmailValidator(UserInputValidator validator) {
        super(validator);
    }

    @Override
    public boolean validate(User user) {
        if (user.email() == null || !user.email().contains("@") || !user.email().contains(".")) {
            System.out.println("Invalid email format.");
            return false;
        }
        return decoratedValidator.validate(user);
    }
}
