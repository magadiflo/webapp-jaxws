package org.magadiflo.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.magadiflo.webapp.jaxws.models.Curso;

import java.util.List;

/**
 * @WebService, indicará que todos los métodos declarados en esta interfaz
 * se publicarán, se van a exponer en el servicio web
 */
@WebService
public interface ServicioWs {

    String saludar(String persona);

    List<Curso> listar();

    Curso crear(Curso curso);

}
