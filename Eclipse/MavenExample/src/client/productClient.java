package client;

import presentation.ProductPresentation;
import presentation.ProductPresentationImpl;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class productClient {
	public static void main(String[] args) {
		
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("client/product.xml");
		ProductPresentation productPresentation=(ProductPresentation)springContainer.getBean("productPres");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			productPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			productPresentation.performMenu(choice);
		}

	}
}
