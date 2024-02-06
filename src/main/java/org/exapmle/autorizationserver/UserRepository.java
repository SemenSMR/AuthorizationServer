package org.exapmle.autorizationserver;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final List<Authorities> adminAuthorities = Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
    private final List<Authorities> writeDeleteAuthorities = Arrays.asList(Authorities.WRITE, Authorities.DELETE);
    private final List<Authorities> readerDeleteAuthorities = Arrays.asList(Authorities.READ, Authorities.DELETE);

    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin".equals(password)) {
            return adminAuthorities;
        } else if ("evgenii".equals(user) && "admin".equals(password)) {
            return writeDeleteAuthorities;
        } else if ("alex".equals(user) && "admin".equals(password)) {
            return readerDeleteAuthorities;
        } else {
            return Collections.emptyList();
        }
    }
}
