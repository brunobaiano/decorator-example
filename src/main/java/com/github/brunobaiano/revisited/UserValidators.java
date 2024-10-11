package com.github.brunobaiano.revisited;

import com.github.brunobaiano.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public interface UserValidators {
    // Static email validator
    static String emailValidator(User user) {
        if (user.email() == null || !user.email().contains("@") || !user.email().contains(".")) {
            return "Invalid email format.";
        }
        return null;
    }

    // Static username validator
    static String usernameValidator(User user) {
        if (user.username() == null || user.username().length() < 5) {
            return "Invalid username: must be at least 5 characters long.";
        }
        return null;
    }

    // Method to get the list of validation rules
    static List<Function<User,String>> getValidationRules() {
        List<Function<User,String>> validationRules = new ArrayList<>();

        // Add the existing static validators as predicates
        validationRules.add(UserValidators::emailValidator);
        validationRules.add(UserValidators::usernameValidator);

        return validationRules;
    }
}

