package org.exapmle.autorizationserver.model;

import jakarta.validation.constraints.NotEmpty;

public class User {
    //@NotEmpty(message = "User name must not be empty")
    private String user;
   // @NotEmpty(message = "Password name must not be empty")
    private String password;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
