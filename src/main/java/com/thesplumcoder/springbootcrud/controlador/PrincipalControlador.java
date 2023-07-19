package com.thesplumcoder.springbootcrud.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thesplumcoder.springbootcrud.modelo.MensajeCorreo;
import com.thesplumcoder.springbootcrud.servicio.ActualizarServicio;
import com.thesplumcoder.springbootcrud.servicio.CrearServicio;
import com.thesplumcoder.springbootcrud.servicio.EliminarServicio;
import com.thesplumcoder.springbootcrud.servicio.LeerServicio;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/") // This means URL's start with / (after Application path)
public class PrincipalControlador {
  @Autowired
  private LeerServicio lS;

  @Autowired
  private CrearServicio cS;

  @Autowired
  private ActualizarServicio aS;

  @Autowired
  private EliminarServicio eS;

  @GetMapping(path = "/leer")
  public @ResponseBody Iterable<MensajeCorreo> darTodosMensajesCorreos() {
    // This returns a JSON or XML with the users
    return lS.traerTodos();
  }

  @PostMapping(path = "/agregar") // Map ONLY POST Requests
  public @ResponseBody String nuevoMensaje(
      @RequestParam Long id,
      @RequestParam Long idEmisarioCorreo,
      @RequestParam String asunto,
      @RequestParam String identificadorMensaje,
      @RequestParam String activo) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    MensajeCorreo mc = new MensajeCorreo();
    mc.fijarId(id);
    mc.fijarIdEmisarioCorreo(idEmisarioCorreo);
    mc.fijarAsunto(asunto);
    mc.fijarIdentificadorMensaje(identificadorMensaje);
    mc.fijarActivo(activo);
    cS.guardar(mc);
    return "Guardado";
  }

  @PostMapping(path = "/actualizar") // Map ONLY POST Requests
  public @ResponseBody String cambiarMensaje(
      @RequestParam Long id,
      @RequestParam Long idEmisarioCorreo,
      @RequestParam String asunto,
      @RequestParam String identificadorMensaje,
      @RequestParam String activo) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    MensajeCorreo mc = new MensajeCorreo();
    mc.fijarId(id);
    mc.fijarIdEmisarioCorreo(idEmisarioCorreo);
    mc.fijarAsunto(asunto);
    mc.fijarIdentificadorMensaje(identificadorMensaje);
    mc.fijarActivo(activo);
    aS.actualizar(mc);
    return "Actualizado";
  }

  @DeleteMapping(path = "/eliminar")
  public @ResponseBody String eliminarMensaje(@RequestParam Long id) {
    eS.eliminar(id);
    return "Eliminado";
  }
}
