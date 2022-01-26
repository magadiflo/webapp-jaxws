package org.magadiflo.webapp.jaxws.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.magadiflo.webapp.jaxws.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.magadiflo.webapp.jaxws.services.ServicioWs")
public class ServicioWsImpl implements ServicioWs {

    private int contador;

    @Override
    @WebMethod
    public String saludar(String persona) {
        System.out.println("Imprimiendo dentro del servicio web con instancia: " + this);
        this.contador++;
        System.out.println("Contador en el metodo sludar...................: " + this.contador);
        return "Hola que tal " + persona;
    }

    @Override
    @WebMethod
    public List<Curso> listar() {
        return Arrays.asList(
                new Curso("Matematica"),
                new Curso("Programacion Java"),
                new Curso("Avanzado de Angular"));
    }

    @Override
    @WebMethod
    public Curso crear(Curso curso) {
        System.out.println("Curso guardado con exito......" + curso.getNombre());
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNombre(curso.getNombre());
        return nuevoCurso;
    }

}
