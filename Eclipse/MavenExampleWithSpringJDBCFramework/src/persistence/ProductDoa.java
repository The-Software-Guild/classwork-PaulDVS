package persistence;

import entities.product;

import java.util.List;

public interface ProductDoa {
	List<product> getProductList();
	int insertRecord(product product);
	product getRecordById(int id);
	int deleteRecord(int id);
	int updatePrice(int id, double newPrice);
}
