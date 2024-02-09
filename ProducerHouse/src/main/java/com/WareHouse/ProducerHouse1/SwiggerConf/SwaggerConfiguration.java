package com.WareHouse.ProducerHouse1.SwiggerConf;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc

public class SwaggerConfiguration extends WebMvcConfigurerAdapter{
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()) // Package selection
				.paths(PathSelectors.any())
				.build().apiInfo(metaData());
	}

	

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Spring Boot REST API", "Spring Boot REST API On Customer Management System", "1.0.0",
				"Terms of service",
				new Contact("vishal", "https://springframework.com/about/", "pa@gmail.com"),
				"Apache License Version 2.0.0", "https://www.apache.org/licenses/LICENSE-1.0.0");
		return apiInfo;
	}
}
