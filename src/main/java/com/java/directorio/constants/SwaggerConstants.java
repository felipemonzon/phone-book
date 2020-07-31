package com.java.directorio.constants;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description: Constantes para la documentación del servicio.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "swagger")
public class SwaggerConstants {
  /**
   * Configuracion de paquetes base de Swagger.
   */
  private String basePackage;
  /**
   * Titulo Swagger.
   */
  private String title;
  /**
   * Descripción de la aplicación.
   */
  private String descriptionApi;
  /**
   * Versión del servicio.
   */
  private String version;
  /**
   * Nombre del desarrollador.
   */
  private String developerName;
  /**
   * URL de Contacto.
   */
  private String contactUrl;
  /**
   * Email del desarrollador.
   */
  private String developerEmail;
}
