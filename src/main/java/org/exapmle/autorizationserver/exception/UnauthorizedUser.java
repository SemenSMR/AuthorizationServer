package org.exapmle.autorizationserver.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg ) {
        super(msg);
    }
}
