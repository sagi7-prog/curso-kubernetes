package org.hdez.springcloud.msvc.usuarios.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

//comunicacion servicio
//@FeignClient(name = "msvc-cursos")

//comunicarnos a aplicaciones o base de datos de nuestro equipo local con host.docker.internal
//@FeignClient(name = "msvc-cursos", url = "host.docker.internal:8002")

//Configurando comunicacion con la red network - contenedor
@FeignClient(name = "msvc-cursos", url = "msvc-cursos:8002")

//local comunicacion feing
//@FeignClient(name = "msvc-cursos", url = "localhost:8002")
public interface CursoClienteRest {

    @DeleteMapping("eliminar-curso-usuario/{id}")
    void eliminarCursoUsuarioPorId(@PathVariable Long id);

}
