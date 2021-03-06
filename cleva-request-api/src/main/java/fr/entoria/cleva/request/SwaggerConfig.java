package fr.entoria.cleva.request;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * Swagger Class
 * http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api To test :
 * <Path to app>/v2/api-docs <Path to app>/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2).select()
		    .apis(RequestHandlerSelectors.basePackage("fr.entoria.cleva.request.controller"))
		    .paths(PathSelectors.any())
		    .build();
    }
}