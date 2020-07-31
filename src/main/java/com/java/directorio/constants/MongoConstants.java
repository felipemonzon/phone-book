package com.java.directorio.constants;

/**
 * @description: Constantes para mongo.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
public class MongoConstants {
  /**
   * Coleccion de phoneBook.
   */
  public static final String PHONE_BOOK_COLLECTION = "phoneBook";
  /**
   * Campo nombre de cliente de la coleccion de phoneBook.
   */
  public static final String CUSTOMER_NAME_FILED = "customerName";
  /**
   * Campo apellidos de cliente de la coleccion de phoneBook.
   */
  public static final String CUSTOMER_LASTNAME_FILED = "customerLastName";
  /**
   * Campo telefono de cliente de la coleccion de phoneBook.
   */
  public static final String CUSTOMER_TELEPHONE_FILED = "telephone";
  /**
   * Campo departamento de cliente de la coleccion de phoneBook.
   */
  public static final String CUSTOMER_DEPARTMENT_FILED = "department";
  /**
   * Campo id.
   */
  public static final String ID_FILED = "_id";
  /**
   * Tipo de operacion.
   */
  public static final String OPERATION_TYPE = "operationType";

  /**
   * Constructor de la clase.
   */
  private MongoConstants() {}
}
