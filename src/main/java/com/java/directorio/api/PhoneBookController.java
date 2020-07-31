package com.java.directorio.api;

import com.java.directorio.business.PhoneBookBusiness;
import com.java.directorio.constants.RoutesConstants;
import com.java.directorio.dto.PhoneBook;
import com.java.directorio.service.PhoneBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @description: EndPoint del servicio.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@RestController
@RequestMapping(path = RoutesConstants.BASE_PATH)
public class PhoneBookController {
  /**
   * Inyeccion {@link PhoneBookBusiness}
   */
  @Autowired
  private PhoneBookService phoneBookService;

  /**
   * Consulta el directorio.
   * 
   * @return directorio completo.
   */
  @GetMapping(path = RoutesConstants.FIND_PHONE_BOOK_PATH)
  public ResponseEntity<Flux<PhoneBook>> getAllPhoneBook() {
    return ResponseEntity.ok(this.phoneBookService.getAllPhoneBook());
  }

  /**
   * Observador de contactos del directorio,
   * 
   * @return contactos añadidos o modificados.
   */
  @GetMapping(path = RoutesConstants.WATCHER_PHONE_BOOK_PATH)
  public Flux<PhoneBook> watchPhoneBook() {
    return this.phoneBookService.watchPhoneBook();
  }

  /**
   * Añade un contacto al directorio.
   * 
   * @param phoneBook contacto a guardar en el direvtorio
   */
  @PostMapping(path = RoutesConstants.SAVE_PHONE_BOOK_PATH,
      consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<PhoneBook> savePhoneBook(@Valid @RequestBody PhoneBook phoneBook) {
    return this.phoneBookService.addPhoneBook(phoneBook);
  }
}
