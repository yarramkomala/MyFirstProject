package com.niit.configaration;
//this is similar to dispatcher-servlet.xml...but it is java configured.
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //this indicates that this class contains one or more beans
	@EnableWebMvc//It enables support for @Controller-annotated classes
	@ComponentScan(basePackages = "com.niit.*")//providing with where to look for spring managed beans/classes.
	public class HelloWorldConfigaration extends WebMvcConfigurerAdapter  {
	 @Override //
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/Resources/**").addResourceLocations("/Resources/images");
	  }

	  @Override
	  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	      configurer.enable();
	  }

	    @Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	 
	        return viewResolver;
	    }
	 
	}

