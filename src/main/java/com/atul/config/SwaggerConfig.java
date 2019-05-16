package com.atul.config;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Go to http://localhost:8080/v2/api-docs to see the results
 * SwaggerUI: http://localhost:8080/swagger-ui.html
 * 
 * @author SAtul
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket feedApi() {
        return new Docket(SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .build();
    }
}