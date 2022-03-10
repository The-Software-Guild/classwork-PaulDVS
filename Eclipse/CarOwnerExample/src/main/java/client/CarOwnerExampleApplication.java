package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import entity.Car;
import entity.CarOwner;
import persistence.CarDoa;
import persistence.CarOwnerDoa;

@SpringBootApplication(scanBasePackages = "persistence")
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "persistence")
public class CarOwnerExampleApplication implements CommandLineRunner {

	@Autowired
	private CarDoa carDoa;
	
	@Autowired
	private CarOwnerDoa carOwnerDoa;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CarOwnerExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car c1 = new Car("c001", "Audi");
		Car c2 = new Car("c002", "Volkswagen");
		Car c3 = new Car("c003", "DuneBuggy");
		
		
		CarOwner o1 = new CarOwner("o001", "Alex", c1);
		CarOwner o2 = new CarOwner("o002", "John", c2);
		CarOwner o3 = new CarOwner("o003", "Ben", c3);
		
		carDoa.save(c1);
		carDoa.save(c2);
		carDoa.save(c3);
		
		carOwnerDoa.save(o1);
		carOwnerDoa.save(o2);
		carOwnerDoa.save(o3);
		
		System.out.println("Data saved");
		
	}

}
