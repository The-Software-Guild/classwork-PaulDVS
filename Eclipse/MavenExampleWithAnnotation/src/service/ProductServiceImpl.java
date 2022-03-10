package service;

import entities.product;
import persistence.ProductDoa;
import persistence.ProductDoaImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDoa productDoa;
	
	
	
	public ProductServiceImpl(ProductDoa productDoa) {
		super();
		this.productDoa = productDoa;
	}



	@Override
	public List<product> getAllProducts() {
		return productDoa.getProductList();
	}



	@Override
	public boolean saveProduct(product product) {
		int rows=productDoa.insertRecord(product);
		if(rows>0)
			return true;
		return false;
	}



	@Override
	public product getProductById(int id) {
		return productDoa.getRecordById(id);
	}



	@Override
	public boolean deleteProduct(int id) {
		int rows=productDoa.deleteRecord(id);
		if(rows>0)
			return true;
		return false;
	}



	@Override
	public boolean updateProductPrice(int id, double newPrice) {
		int rows=productDoa.updatePrice(id, newPrice);
		if(rows>0)
			return true;
		return false;
	}

}
