package org.hdez.springcloud.msvc.course.services;

import org.hdez.springcloud.msvc.course.models.Usuario;
import org.hdez.springcloud.msvc.course.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    void eliminarCursoUsuarioPorId(Long id);

    //metodos con feing
    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);

}
