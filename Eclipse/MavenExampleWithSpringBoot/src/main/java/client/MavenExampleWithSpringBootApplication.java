package client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import presentation.ProductPresentation;

@SpringBootApplication(scanBasePackages = "presentation, service, persistence")
public class MavenExampleWithSpringBootApplication implements CommandLineRunner {

	@Autowired 
	private ProductPresentation productPresentation;
	
	public static void main(String[] args) {
		/* ApplicationContext springContainer = */ SpringApplication.run(MavenExampleWithSpringBootApplication.class, args);
		//ProductPresentation productPresentation=(ProductPresentation)springContainer.getBean("productPres");
		
		
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
