package com.Entity.configuration_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer ;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({"com.Entity"})
public class MVCconfig implements WebMvcConfigurer  {
	
	@Bean
	public ViewResolver viewResolver() { 
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
         .addResourceHandler("/css/**")
         .addResourceLocations("/resources/css/");	
        
        registry
        .addResourceHandler("/js/**")
        .addResourceLocations("/resources/js/");
    }
}
