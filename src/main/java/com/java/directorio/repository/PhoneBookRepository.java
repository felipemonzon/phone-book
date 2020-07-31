package com.java.directorio.repository;

import com.java.directorio.domain.PhoneBookDomain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

/**
 * @description: Repositorio para la coleccion "phoneBook".
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Repository
public interface PhoneBookRepository extends ReactiveCrudRepository<PhoneBookDomain, Integer> {
  Mono<PhoneBookDomain> findByTelephone(final String telephone);
}
