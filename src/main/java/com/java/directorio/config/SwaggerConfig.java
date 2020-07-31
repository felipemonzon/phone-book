package com.java.directorio.config;

import com.java.directorio.constants.SwaggerConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @description: Clase de configuración para swagger-ui.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Configuration
// @EnableSwagger2
public class SwaggerConfig {
  /**
   * Inyecta la clase con los valores obtenidos del archivo properties.
   */
  @Autowired
  private SwaggerConstants swaggerConstants;

  /**
   * Bean para escanear las APIs existentes y generar swagger-ui.
   * 
   * @return product api
   */
  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(Boolean.FALSE)
        .select().apis(RequestHandlerSelectors.basePackage(swaggerConstants.getBasePackage()))
        .paths(PathSelectors.any()).build().apiInfo(apiInfo());
  }

  /**
   * Constructor para la información de la API.
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title(swaggerConstants.getTitle())
        .description(swaggerConstants.getDescriptionApi()).version(swaggerConstants.getVersion())
        .contact(new Contact(swaggerConstants.getDeveloperName(), swaggerConstants.getContactUrl(),
            swaggerConstants.getDeveloperEmail()))
        .build();
  }
}
