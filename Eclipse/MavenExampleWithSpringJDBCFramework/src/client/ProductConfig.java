package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import persistence.ProductDoaImpl;
import presentation.ProductPresentationImpl;
import service.ProductServiceImpl;

@Configuration
@ComponentScan(basePackages = "client, entities, persistence, presentation, service, util")
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
	
	
	
	@Bean
	public DriverManagerDataSource datasource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc173");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("lychee");
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}
}
