package com.acme.edu;

import com.acme.edu.commands.arrays.ArrayIntCommand;
import com.acme.edu.commands.arrays.MatrixIntArrayCommand;
import com.acme.edu.commands.arrays.MultimatrixIntCommand;
import com.acme.edu.commands.types.*;
import com.acme.edu.commands.types.primitive.BooleanCommand;
import com.acme.edu.commands.types.primitive.ByteCommand;
import com.acme.edu.commands.types.primitive.IntCommand;
import com.acme.edu.overflow.OverflowException;
import com.acme.edu.saver.ConsoleSaver;
import com.acme.edu.saver.SaverException;

import java.util.logging.Level;


public class Logger {
    private static LoggerController loggerController = new LoggerController(new ConsoleSaver());
    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());

    public static void log(Object message) {
        try {
            loggerController.handleCommand(new ReferenceCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(char message) {
        try {
            loggerController.handleCommand(new CharCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(boolean message) {
        try {
            loggerController.handleCommand(new BooleanCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(byte message) {
        try {
            loggerController.handleCommand(new ByteCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(int message) {
        try {
            loggerController.handleCommand(new IntCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(String message) {
        try {
            loggerController.handleCommand(new StringCommand(message));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(int [] array) {
        try {
            loggerController.handleCommand(new ArrayIntCommand(array));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(int [][] array) {
        try {
            loggerController.handleCommand(new MatrixIntArrayCommand(array));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(int[][][][] array) {
        try {
            loggerController.handleCommand(new MultimatrixIntCommand(array));
        } catch (SaverException e) {
            LOGGER.log(Level.SEVERE, "Error in saver");
        }
    }

    public static void log(String... messages) {
        for(String message: messages) {
            try {
                loggerController.handleCommand(new StringCommand(message));
            } catch (SaverException e) {
                LOGGER.log(Level.SEVERE, "Error in saver");
            }
        }
    }

    public static void log(Integer... messages) {
        for(int message: messages) {
            try {
                loggerController.handleCommand(new IntCommand(message));
            } catch (SaverException e) {
                LOGGER.log(Level.SEVERE, "Error in saver");
            }
        }
    }

    public static void closeLogger() {
        try {
            loggerController.close();
        } catch (OverflowException e) {
            LOGGER.log(Level.SEVERE, "Error in close logger");
        }
    }
}


