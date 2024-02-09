package org.exapmle.autorizationserver.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.exapmle.autorizationserver.model.Authorities;
import org.exapmle.autorizationserver.model.User;
import org.exapmle.autorizationserver.service.AuthorizationService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Validated
public class AuthorizationController {
   private final AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }
}
