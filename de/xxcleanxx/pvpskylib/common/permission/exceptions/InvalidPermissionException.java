package de.xxcleanxx.pvpskylib.common.permission.exceptions;

public class InvalidPermissionException extends RuntimeException {
    private static final long serialVersionUID = -8062364103427915128L;

    public InvalidPermissionException() {
        super();
    }

    public InvalidPermissionException(String message) {
        super(message);
    }
}