package com.thesplumcoder.springbootcrud.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.thesplumcoder.springbootcrud.modelo.MensajeCorreo;

public interface MensajeCorreoRepositorio extends CrudRepository<MensajeCorreo, Long> {
  // Se deja vacio.
}
