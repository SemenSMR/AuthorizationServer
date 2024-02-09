package org.exapmle.autorizationserver.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.exapmle.autorizationserver.exception.ConstraintException;
import org.exapmle.autorizationserver.exception.UnauthorizedUser;
import org.exapmle.autorizationserver.model.Authorities;
import org.exapmle.autorizationserver.repository.UserRepository;
import org.exapmle.autorizationserver.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class AuthorizationService {
   private final UserRepository userRepository;

   public List<Authorities> getAuthorities(@Valid User user) {
        String username = user.getUser();
        String password = user.getPassword();
        if (isEmpty(username) || isEmpty(password)) {
            throw new ConstraintException("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(username,password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Invalid Сredentials " );
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
