package br.edu.fatecpg.blog.blog.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comentarios")
public class Comentario {

    @ManyToOne
    private Post post;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String conteudo;

    public Comentario(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
