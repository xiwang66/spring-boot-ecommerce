package com.sprintcode.ecommerce.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        //protect end point /api/orders

        http.authorizeHttpRequests(configurer->
                        configurer
                                .requestMatchers("/api/orders/**")
                                .authenticated()
                                .anyRequest().permitAll())
                .oauth2ResourceServer()
                .jwt();

        http.cors();

        return http.build();
    }
}