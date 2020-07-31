package com.java.directorio.constants;

/**
 * @description: Constantes para las rutas del endPoint.
 * @author: Felipe Monzón
 * @date: Jul 14, 2020
 * @version: 1.0.0
 */
public abstract class RoutesConstants {
  /**
   * Ruta base del servicio de directorio.
   */
  public static final String BASE_PATH = "${api.phone.book.base.path}";
  /**
   * Ruta para consultar el directorio.
   */
  public static final String FIND_PHONE_BOOK_PATH = "${api.phone.book.retrieve.mapping}";
  /**
   * Ruta para consultar los cambios en los contactos del directorio.
   */
  public static final String WATCHER_PHONE_BOOK_PATH = "${api.phone.book.watcher.mapping}";
  /**
   * Ruta para guardar un contacto en la libreria.
   */
  public static final String SAVE_PHONE_BOOK_PATH = "${api.phone.book.save.mapping}";

  /**
   * Constructor de la clase.
   */
  private RoutesConstants() {}
}
