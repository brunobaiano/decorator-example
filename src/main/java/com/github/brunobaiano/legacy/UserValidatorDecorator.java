package com.github.brunobaiano.legacy;

abstract class UserValidatorDecorator implements UserInputValidator {
    protected UserInputValidator decoratedValidator;

    public UserValidatorDecorator(UserInputValidator validator) {
        this.decoratedValidator = validator;
    }
}