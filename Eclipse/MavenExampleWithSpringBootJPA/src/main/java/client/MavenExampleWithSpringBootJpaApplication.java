package client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import entities.product;
import persistence.ProductDoa;

@SpringBootApplication(scanBasePackages = "persistence")
@EntityScan(basePackages = "entities")
@EnableJpaRepositories(basePackages = "persistence")
public class MavenExampleWithSpringBootJpaApplication implements CommandLineRunner{

	@Autowired
	private ProductDoa productDoa;
	
	public static void main(String[] args) {
		SpringApplication.run(MavenExampleWithSpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("");
		int id = 1;
		product product = productDoa.getById(id);
		System.out.println(product);
		/*
		System.out.println("");
		System.out.println("List of products with price more than 100");
		List<product> productList=productDoa.searchForPriceOver(100);
		System.out.println("");
		for(product product:productList) {
			System.out.println(product);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		productDoa.deleteProductByName("Hello");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		*/
	}

}
