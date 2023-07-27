package com.example.springsecuritycorsdemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(
            final HttpSecurity httpSecurity
    ) throws Exception {
        httpSecurity
                .cors(cors -> {
                    final var corsConfiguration = new CorsConfiguration();
                    corsConfiguration.setAllowedOrigins(List.of("*"));
                    corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST"));

                    final var configurationSource = new UrlBasedCorsConfigurationSource();
                    configurationSource.registerCorsConfiguration("/**", corsConfiguration);

                    cors.configurationSource(configurationSource);
                })
                .authorizeHttpRequests(httpRequests -> httpRequests.anyRequest().permitAll())
        ;
        return httpSecurity.build();
    }
}
