package br.edu.fatecpg.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecpg.application.model.Departamento;
import br.edu.fatecpg.application.model.Funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_NAME");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Departamento departamento1 = new Departamento();
		departamento1.setNome("Departamento de Vendas");
		entityManager.persist(departamento1);

		Departamento departamento2 = new Departamento();
		departamento2.setNome("Departamento de TI");
		entityManager.persist(departamento2);

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("João");
		funcionario1.setDepartamento(departamento1);
		entityManager.persist(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Maria");
		funcionario2.setDepartamento(departamento1);
		entityManager.persist(funcionario2);

		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Pedro");
		funcionario3.setDepartamento(departamento2);
		entityManager.persist(funcionario3);

		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
