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
   * Mide tiempo en metodos de negocio.
   */
  public static final String BUSINESS_GET_ALL_PHONE_BOOK = "BUSINESS - [Consulta el directorio]";
  /**
   * Mide tiempo en metodos de acceso a la base de datos.
   */
  public static final String DATABASE_GET_ALL_PHONE_BOOK = "DATABASE - [Consulta el directorio]";

  /**
   * Constructor de la clase.
   */
  private LogConstants() {}
}
