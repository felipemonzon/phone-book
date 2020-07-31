package com.java.directorio.domain;

import com.java.directorio.constants.MongoConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @description: Entidad para la coleccion "phoneBook".
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = MongoConstants.PHONE_BOOK_COLLECTION)
public class PhoneBookDomain {
  /**
   * Identificador del contacto.
   */
  @Id
  private String id;
  /**
   * Nombre del cliente.
   */
  @Field(name = MongoConstants.CUSTOMER_NAME_FILED)
  private String customerName;
  /**
   * Apellidos del cliente.
   */
  @Field(name = MongoConstants.CUSTOMER_LASTNAME_FILED)
  private String customerLastName;
  /**
   * Telefono del cliente.
   */
  @Field(name = MongoConstants.CUSTOMER_TELEPHONE_FILED)
  private String telephone;
  /**
   * Departamento del cliente.
   */
  @Field(name = MongoConstants.CUSTOMER_DEPARTMENT_FILED)
  private String department;
}
