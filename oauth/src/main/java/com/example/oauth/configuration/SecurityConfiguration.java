package com.example.oauth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


        http.authorizeHttpRequests(auth ->
                auth.requestMatchers("/public/**").permitAll()  // Public
                        .requestMatchers("/private/**").authenticated() // Private
                        .anyRequest().authenticated()
        );

        http.oauth2Login(Customizer.withDefaults());

        return http.build();
    }
}