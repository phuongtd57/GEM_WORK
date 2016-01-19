package com.gem.nhom1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by phuong on 1/19/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.gem.nhom1")
public class MvcConfig {
    @Bean
    ViewResolver viewResolver(){
        InternalResourceViewResolver resourceView = new InternalResourceViewResolver();
        resourceView.setViewClass(JstlView.class);
        resourceView.setPrefix("/WEB-INF/jsp/");
        resourceView.setSuffix(".jsp");
        return resourceView;
    }
}
