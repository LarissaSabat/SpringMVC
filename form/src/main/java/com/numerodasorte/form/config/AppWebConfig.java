package com.numerodasorte.form.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.numerodasorte.form.controllers.HomeController;
import com.numerodasorte.form.daos.SegredoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, SegredoDAO.class})
public class AppWebConfig {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
}
