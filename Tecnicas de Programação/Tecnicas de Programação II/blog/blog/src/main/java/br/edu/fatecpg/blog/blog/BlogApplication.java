package br.edu.fatecpg.blog.blog;

import br.edu.fatecpg.blog.blog.models.Comentario;
import br.edu.fatecpg.blog.blog.models.Post;
import br.edu.fatecpg.blog.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BlogApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Post post1 = new Post("Java 23", "Java 23");
		Post post2 = new Post("Switch 2", "Console da NIntendo");

		Comentario comentario1 = new Comentario("Dutra", "interessante");
		post1.setComentarios(comentario1);
		postRepository.save(post1);

		Comentario comentario2 = new Comentario("Luccas", "Adoravel");
		post1.setComentarios(comentario2);
		postRepository.save(post1);

		Comentario comentario3 = new Comentario("Bruno", "gostei");
		post2.setComentarios(comentario3);
		postRepository.save(post2);

		Comentario comentario4 = new Comentario("Artur", "vou passar vontade");
		post2.setComentarios(comentario4);
		postRepository.save(post2);

		List<Post> posts = postRepository.findByKeyword("23");
		posts.forEach(System.out::println);
	}
}
