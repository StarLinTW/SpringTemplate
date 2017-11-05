package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//做了DispatcherServlet 的事情
@Configuration
@EnableWebMvc
@ComponentScan("com.controller")
public class WebConfig extends WebMvcConfigurationSupport{
	//靜態資源略過
	@Override
	protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configure) {
		configure.enable();
	}
}
