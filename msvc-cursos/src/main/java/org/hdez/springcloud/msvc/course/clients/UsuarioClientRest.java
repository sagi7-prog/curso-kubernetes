package org.hdez.springcloud.msvc.course.clients;

import org.hdez.springcloud.msvc.course.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//comunicacion servicio
//@FeignClient(name = "msvc-usuarios")

//local comunicacion feing
@FeignClient(name = "msvc-usuarios", url = "localhost:8001")
public interface UsuarioClientRest {
    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping("/")
    Usuario crear(@RequestBody Usuario usuario);

    @GetMapping("/usuario-por-curso")
    List<Usuario> obtenerAlumnosPorCurso(@RequestParam Iterable<Long> ids);

}
