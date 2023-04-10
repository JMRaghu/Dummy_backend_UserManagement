//package com.microservice.usermanagement.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfigurationSource;
//
//public class WebSecurityConfig {
//
//    @Autowired
//    private CorsConfigurationSource corsConfigurationSource;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//
//        http.cors().configurationSource(corsConfigurationSource);
//
//        http.authorizeHttpRequests().anyRequest().permitAll();
//
//        return http.build();
//
//    }
//}
