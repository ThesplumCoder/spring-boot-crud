package com.thesplumcoder.springbootcrud.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesplumcoder.springbootcrud.repositorio.MensajeCorreoRepositorio;
import com.thesplumcoder.springbootcrud.modelo.MensajeCorreo;

@Service
public class CrearServicio {

  @Autowired
  private MensajeCorreoRepositorio mcr;

  public void guardar(MensajeCorreo mc) {
    mcr.save(mc);
  }
}
