package com.java.directorio.business;

import com.java.directorio.constants.LogConstants;
import com.java.directorio.domain.PhoneBookDomain;
import com.java.directorio.dto.PhoneBook;
import com.java.directorio.repository.PhoneBookRepository;
import com.java.directorio.service.PhoneBookService;
import com.java.directorio.watcher.PhoneBookWatcher;

import lombok.extern.slf4j.Slf4j;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @description: Implementación del negocio.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Slf4j
@Service
public class PhoneBookBusiness implements PhoneBookService {
  /**
   * Repositorio {@link PhoneBookRepository}
   */
  @Autowired
  private PhoneBookRepository phoneBookRepository;
  /**
   * Repositorio observador {@link PhoneBookWatcher}.
   */
  @Autowired
  private PhoneBookWatcher phoneBookWatcher;

  /**
   * {@inheritDoc}.
   */
  @Override
  //@LogExecutionTime(name = LogConstants.BUSINESS_GET_ALL_PHONE_BOOK)
  public Flux<PhoneBook> getAllPhoneBook() {
    log.info(LogConstants.GET_PHONE_BOOK);
    Flux<PhoneBookDomain> entity = this.phoneBookRepository.findAll();
    return entity.flatMap(o -> Flux.just(this.phoneBookMapper(o)));
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public Mono<PhoneBook> addPhoneBook(PhoneBook phoneBook) {
    log.info(LogConstants.REQUEST, phoneBook);
    PhoneBookDomain entity = this.phoneBookMapper(phoneBook);
    Mono<PhoneBookDomain> domain = this.phoneBookRepository.save(entity);
    return domain.flatMap(pb -> Mono.just(this.phoneBookMapper(pb)));
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public Flux<PhoneBook> watchPhoneBook() {
    log.info(LogConstants.STREAMING_PHONE_BOOK);
    return this.phoneBookWatcher.watchForPhoneBookCollectionChanges()
        .flatMap(pb -> Flux.just(this.phoneBookMapper(pb)));
  }

  /**
   * Mapea el objeto obtenido de base de datos al objeto destino.
   * 
   * @param entity objeto obtenido de la base de datos
   * @return objeto de tipo {@link PhoneBook}
   */
  private PhoneBook phoneBookMapper(PhoneBookDomain entity) {
    return new ModelMapper().map(entity, PhoneBook.class);
  }

  /**
   * Mapea el objeto de entrada a la entidad correspondiente.
   * 
   * @param phoneBook objeto recibido en la peticion
   * @return objeto de tipo {@link PhoneBookDomain}
   */
  private PhoneBookDomain phoneBookMapper(PhoneBook phoneBook) {
    return new ModelMapper().map(phoneBook, PhoneBookDomain.class);
  }
}
