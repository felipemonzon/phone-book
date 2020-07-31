package com.java.directorio.watcher;

import com.java.directorio.constants.LogConstants;
import com.java.directorio.constants.MongoConstants;
import com.java.directorio.domain.PhoneBookDomain;
import com.mongodb.client.model.changestream.OperationType;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ChangeStreamEvent;
import org.springframework.data.mongodb.core.ChangeStreamOptions;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

/**
 * @description: Observador de la coleccion phonebook.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Slf4j
@Service
public class PhoneBookWatcher {
  /**
   * Componente de mongo.
   */
  @Autowired
  private ReactiveMongoTemplate reactiveMongoTemplate;

  /**
   * Observador de cambios en la coleccion phoneBook.
   * 
   * @return contactos que sufrieron cambios
   */
  public Flux<PhoneBookDomain> watchForPhoneBookCollectionChanges() {
    return this.reactiveMongoTemplate
        .changeStream(MongoConstants.PHONE_BOOK_COLLECTION, this.options(), PhoneBookDomain.class)
        .map(ChangeStreamEvent::getBody)
        .doOnError(ex -> log.error(LogConstants.ERROR_CHANGE_PHONE_BOOK, ex.getMessage(), ex));
  }

  /**
   * Opciones para detectar el cambio.
   * 
   * @return objeto con las opciones de cambio
   */
  private ChangeStreamOptions options() {
    return ChangeStreamOptions.builder()
        .filter(Aggregation.newAggregation(PhoneBookDomain.class,
            Aggregation.match(Criteria.where(MongoConstants.OPERATION_TYPE)
                .in(OperationType.REPLACE.getValue(), OperationType.INSERT.getValue()))))
        .returnFullDocumentOnUpdate().build();
  }
}
