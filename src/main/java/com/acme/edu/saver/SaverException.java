package com.acme.edu.saver;

public class SaverException extends Exception {

    public SaverException(String message) {
        super(message);
    }

    public SaverException(Throwable throwable){ super(throwable); }

    public SaverException(String message, Throwable cause) {
        super(message, cause);
    }
}
