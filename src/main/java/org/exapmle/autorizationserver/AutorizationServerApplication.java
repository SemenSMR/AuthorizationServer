package org.exapmle.autorizationserver;

import org.exapmle.autorizationserver.model.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class AutorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutorizationServerApplication.class, args);
    }
}

