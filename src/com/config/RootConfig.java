package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//除了springMVC 之外一般的的bean
//做了ContextLoaderListener的事情
@Configuration
@ComponentScan(basePackages= {"com.service"})
public class RootConfig {

}
