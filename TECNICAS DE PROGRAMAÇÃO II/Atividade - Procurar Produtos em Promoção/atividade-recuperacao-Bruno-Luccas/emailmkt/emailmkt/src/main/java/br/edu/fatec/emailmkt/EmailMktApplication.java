package br.edu.fatec.emailmkt;

import br.edu.fatec.emailmkt.service.ConsomeApi;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmailMktApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmailMktApplication.class, args);
	}

	@Override
	public  void run(String...args) throws Exception {
		ConsomeApi lerApi = new ConsomeApi();
		String dados = lerApi.obterDados("http://api.escuelajs.co/api/v1/products/");
		System.out.println(dados);
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode jsonNode = objMapper.readTree(dados);
		//System.out.println(jsonNode);
		List<JsonNode> jsonList = new ArrayList<>();
		jsonNode.forEach(jsonList::add);
		//jsonList.stream().forEach(System.out::println);
		List<String> imperdiveis = new ArrayList<>();
		List<String> promocao = new ArrayList<>();

		for (JsonNode node : jsonList) {
			String title = node.get("title").asText();
			String priceStr = node.get("price").asText();
			double price = Double.parseDouble(priceStr);

			if (price <= 30.0) {
				imperdiveis.add(title.toUpperCase());
				promocao.add(title.toUpperCase() + " - R$" + priceStr);
			}
		}

		System.out.println("Imperdíveis:");
		imperdiveis.forEach(System.out::println);

		System.out.println("\nEm Promoção:");
		promocao.forEach(System.out::println);

	}

}
