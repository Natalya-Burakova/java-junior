package com.acme.edu.commands.types;

import com.acme.edu.commands.Command;

public class CharCommand implements Command {
    private static final String CHAR_PREFIX = "char: ";
    private char message;

    public CharCommand (char message) {
        this.message = message;
    }

    @Override
    public String decorate() {
        return CHAR_PREFIX + message;
    }

    @Override
    public String getMessage() { return String.valueOf(message); }
}
