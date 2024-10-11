package com.github.brunobaiano.legacy;

import com.github.brunobaiano.model.User;

public class AlwaysValid implements UserInputValidator {
    @Override
    public boolean validate(User user) {
        return true; // Always valid, allows to terminate the chain
    }
}
