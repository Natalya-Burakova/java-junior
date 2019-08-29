package com.acme.edu.commands.arrays;

import com.acme.edu.StateCommand;
import com.acme.edu.commands.Command;

public class ArrayIntCommand extends ArrayCommand {
    private int[] message;

    public ArrayIntCommand(int[] message) {
        this.message = message;
    }

    @Override
    public String decorate() {
        return super.decorateArray(message);
    }

    @Override
    public Command<String> accumulate(Command command) {
        return new ArrayIntCommand(message);
    }

    @Override
    public String getMessage() { return String.valueOf(message); }

    @Override
    public StateCommand getState() {
        return StateCommand.NONE;
    }
}
