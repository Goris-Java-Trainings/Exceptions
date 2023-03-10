package org.example.exception;

public class PersonException extends RuntimeException {

    private String message;

    public PersonException() {
        super();
    }

    public PersonException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
