package org.exapmle.autorizationserver;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.exapmle.autorizationserver.user.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Validated
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }
}
