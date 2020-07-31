package com.java.directorio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @description: Entrada o salida del servicio de pedidos.
 * @author: Felipe Monzón
 * @date: Jul 10, 2020
 * @version: 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneBook {
  /**
   * Identificador del contacto.
   */
  private String id;
  /**
   * Nombre del cliente.
   */
  @NotEmpty
  private String customerName;
  /**
   * Apellidos del cliente.
   */
  @NotEmpty
  private String customerLastName;
  /**
   * Telefono del cliente.
   */
  @NotEmpty
  private String telephone;
  /**
   * Departamento del cliente.
   */
  @NotEmpty
  private String department;
}
