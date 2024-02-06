package org.exapmle.autorizationserver;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.exapmle.autorizationserver.Exception.InvalidCredentials;
import org.exapmle.autorizationserver.Exception.UnauthorizedUser;
import org.exapmle.autorizationserver.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class AuthorizationService {
    UserRepository userRepository;

    List<Authorities> getAuthorities(@Valid User user) {
        String username = user.getUser();
        String password = user.getPassword();
        if (isEmpty(username) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(username,password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + username);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
