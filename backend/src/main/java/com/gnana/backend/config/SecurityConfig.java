package com.gnana.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // disable CSRF for API
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // allow all requests
                )
                .formLogin(AbstractHttpConfigurer::disable) // disable form login
                .httpBasic(AbstractHttpConfigurer::disable); // disable basic auth

        return http.build();
    }
}
