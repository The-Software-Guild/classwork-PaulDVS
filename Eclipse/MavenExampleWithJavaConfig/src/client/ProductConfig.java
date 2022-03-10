package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import persistence.ProductDoaImpl;
import presentation.ProductPresentationImpl;
import service.ProductServiceImpl;

@Configuration
public class ProductConfig {
	
	@Bean
	public ProductDoaImpl productDoa() {
		return new ProductDoaImpl();
	}
	
	@Bean
	public ProductServiceImpl productServ() {
		return new ProductServiceImpl(productDoa());
	}	
	
	@Bean
	public ProductPresentationImpl productPres() {
		return new ProductPresentationImpl(productServ());
	}
}
