package br.edu.fatecpg.catalogo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private List<Produto> produtos = new ArrayList<>();

    public Categoria(){}

    public Categoria(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
