package com.czetsuyatech;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import com.czetsuyatech.config.PathBasedConfigResolver;

@SpringBootApplication
public class SpringKeycloakMultiTenantApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKeycloakMultiTenantApplication.class, args);
    }

    /**
     * Required to handle spring boot configurations
     * 
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(PathBasedConfigResolver.class)
    public KeycloakConfigResolver keycloakConfigResolver() {
        return new PathBasedConfigResolver();
    }
}
