package com.java.directorio.service;

import com.java.directorio.dto.PhoneBook;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @description: Servicio de directorio.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
public interface PhoneBookService {
  /**
   * Alta contactos en el directorio.
   * 
   * @param phoneBook objeto de tipo {@link PhoneBook}
   * @return un objeto tipo {@link PhoneBook}
   */
  Mono<PhoneBook> addPhoneBook(PhoneBook phoneBook);

  /**
   * Consulta todos los contactos del directoprio.
   * 
   * @return un objeto tipo {@link PhoneBook}
   */
  Flux<PhoneBook> getAllPhoneBook();

  /**
   * Observador de la coleccion directorio.
   * 
   * @return contactos modificados o nuevos
   */
  Flux<PhoneBook> watchPhoneBook();
}
