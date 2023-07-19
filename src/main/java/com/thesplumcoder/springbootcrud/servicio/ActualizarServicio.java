package com.thesplumcoder.springbootcrud.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesplumcoder.springbootcrud.repositorio.MensajeCorreoRepositorio;
import com.thesplumcoder.springbootcrud.modelo.MensajeCorreo;

@Service
public class ActualizarServicio {

  @Autowired
  private MensajeCorreoRepositorio mcr;

  public void actualizar(MensajeCorreo mc) {
    mcr.save(mc);
  }
}
