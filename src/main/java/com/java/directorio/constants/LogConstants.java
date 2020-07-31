package com.java.directorio.constants;

/**
 * @description: Constantes para los logs.
 * @author: Felipe Monzón
 * @date: Jul 14, 2020
 * @version: 1.0.0
 */
public abstract class LogConstants {
  /**
   * Request.
   */
  public static final String REQUEST = "REQUEST {}";
  /**
   * Consulta el diretorio telefonico.
   */
  public static final String GET_PHONE_BOOK = "Consulta el directorio telefonico.";
  /**
   * Streaming de datos.
   */
  public static final String STREAMING_PHONE_BOOK = "Detecta contactos actualizados o añadidos";
  /**
   * Error al detectar el cambio en la coleccion de mongo.
   */
  public static final String ERROR_CHANGE_PHONE_BOOK = "Error change phone book event {}";

  /**
   * Constructor de la clase.
   */
  private LogConstants() {}
}
