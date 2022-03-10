package client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import presentation.ProductPresentation;

@SpringBootApplication(scanBasePackages = "presentation, service, persistence")
public class MavenExampleWithSpringBootJdbcFrameworkApplication implements CommandLineRunner{

	@Autowired 
	private ProductPresentation productPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(MavenExampleWithSpringBootJdbcFrameworkApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			productPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			productPresentation.performMenu(choice);
		}
	}

}
