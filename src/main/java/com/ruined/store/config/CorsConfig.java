package com.ruined.store.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author BoomJs
 * @date 2021/7/19 18:34
 */
//@Configuration
//@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/")
                .allowedOrigins("*")
                .allowedMethods("GET,POST,PUT,DELETE,HEAD,OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(false).maxAge(3600);
    }

}