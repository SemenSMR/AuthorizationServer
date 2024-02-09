package org.exapmle.autorizationserver.Exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg ) {
        super(msg);
    }
}
