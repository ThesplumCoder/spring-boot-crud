package com.thesplumcoder.springbootcrud.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes_predefinidos_correos")
public class MensajeCorreo {

  @Id
  @GeneratedValue()
  @Column(name = "ID", nullable = false)
  private Long id;

  @Column(name = "ID_EMISARIO_CORREO", nullable = false)
  private Long idEmisarioCorreo;

  @Column(name = "ASUNTO", nullable = false)
  private String asunto;

  @Column(name = "IDENTIFICADOR_MENSAJE", nullable = false)
  private String identificadorMensaje;

  @Column(name = "ACTIVO", nullable = false)
  private String activo;

  public void fijarId(Long id) {
    this.id = id;
  }

  public void fijarIdEmisarioCorreo(Long idEmisarioCorreo) {
    this.idEmisarioCorreo = idEmisarioCorreo;
  }

  public void fijarAsunto(String asunto) {
    this.asunto = asunto;
  }

  public void fijarIdentificadorMensaje(String identificadorMensaje) {
    this.identificadorMensaje = identificadorMensaje;
  }

  public void fijarActivo(String activo) {
    this.activo = activo;
  }

  public Long darId() {
    return id;
  }

  public Long darIdEmisarioCorreo() {
    return idEmisarioCorreo;
  }

  public String darAsunto() {
    return asunto;
  }

  public String darIdentificadorMensaje() {
    return identificadorMensaje;
  }

  public String darActivo() {
    return activo;
  }
}
