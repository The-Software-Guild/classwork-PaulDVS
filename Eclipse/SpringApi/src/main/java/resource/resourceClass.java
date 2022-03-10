package resource;

import service.serviceDoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import entities.product;

@RestController
public class resourceClass {
	
	@Autowired
	private serviceDoa serviceDoa;
	
	@GetMapping(path = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
	public String greet() {
		return serviceDoa.greet();
	}
	
	@GetMapping(path = "/product/{n1}",produces = MediaType.APPLICATION_JSON_VALUE)
	public product getProductById(@PathVariable("n1") int id) {
		return serviceDoa.getProductById(id);
	}
}
