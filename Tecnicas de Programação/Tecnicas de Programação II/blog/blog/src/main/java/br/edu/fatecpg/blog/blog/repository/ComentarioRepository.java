package br.edu.fatecpg.blog.blog.repository;

import br.edu.fatecpg.blog.blog.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
