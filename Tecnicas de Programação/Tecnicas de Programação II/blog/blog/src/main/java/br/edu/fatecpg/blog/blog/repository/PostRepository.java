package br.edu.fatecpg.blog.blog.repository;

import br.edu.fatecpg.blog.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitulo(String titulo);

    @Query("SELECT p FROM Post p WHERE p.titulo LIKE %:palavraChave% OR p.conteudo LIKE %:palavraChave%")
    List<Post> findByKeyword(String palavraChave);
}
