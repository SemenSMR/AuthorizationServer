package org.exapmle.autorizationserver;

import org.exapmle.autorizationserver.handler.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutorizationServerApplication.class, args);
    }

    @Bean
    public MyConfiguration myConfiguration() {
        return new MyConfiguration();

    }
}
