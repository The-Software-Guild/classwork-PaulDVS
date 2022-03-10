package service;

import entities.product;

import java.util.List;

public interface ProductService {
	List<product> getAllProducts();
	boolean saveProduct(product product);
	product getProductById(int id);
	boolean deleteProduct(int id);
	boolean updateProductPrice(int id, double newPrice);
}
