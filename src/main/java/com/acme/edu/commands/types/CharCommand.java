package com.acme.edu.commands.types;

import com.acme.edu.buffer.BufferState;
import com.acme.edu.commands.Command;

public class CharCommand implements Command<Character> {
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
    public Command<Character> accumulate(Command command) { return null; }

    @Override
    public Character getMessage() { return message; }

    @Override
    public BufferState getState() { return BufferState.NONE; }
}
