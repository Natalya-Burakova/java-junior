package com.acme.edu.commands.types.primitive;

import com.acme.edu.buffer.BufferState;
import com.acme.edu.buffer.ControllerOverflow;
import com.acme.edu.commands.Command;

public class IntCommand extends PrimitiveCommand implements Command<Integer> {
    private Integer message;

    public IntCommand(int message) {
        this.message = message;
    }

    @Override
    public String decorate() { return super.getPrimitivePrefix() + message; }

    @Override
    public Command<Integer> accumulate(Command command) {
        if (command instanceof IntCommand) {
            ControllerOverflow.controlOverflow((Integer) command.getMessage(), this);
            return new IntCommand(message);
        }
        else {
            throw new IllegalArgumentException("Wrong command!");
        }
    }

    @Override
    public Integer getMessage() { return message; }


    public void setMessage(int message) { this.message = message; }

    @Override
    public BufferState getState() { return BufferState.INT; }

}
