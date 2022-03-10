package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import entities.product;
import util.ProductRowMapper;

@Component
public class ProductDoaImpl implements ProductDoa {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<product> getProductList() {
		List<product> productList=new ArrayList<product>();

		String query = "SELECT * FROM PRODUCT";
		productList = jdbcTemplate.query(query, new ProductRowMapper());

		return productList;
	}

	@Override
	public int insertRecord(product product) {
		
		String query = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
		int rows = jdbcTemplate.update(query, product.getProductID(), product.getCode(), product.getName(), product.getDesc(), product.getPrice());

		return rows;

	}

	@Override
	public product getRecordById(int id) {

		String query = "SELECT * FROM PRODUCT WHERE productID=?";
		product product = jdbcTemplate.queryForObject(query, new ProductRowMapper(), id);

		return product;
	}

	@Override
	public int deleteRecord(int id) {
		String query = "DELETE FROM PRODUCT WHERE productID=?";
		int rows = jdbcTemplate.update(query, id);

		return rows;
		
	}

	@Override
	public int updatePrice(int id, double newPrice) {
		String query = "UPDATE PRODUCT SET productPrice = ? WHERE productID=?";
		int rows = jdbcTemplate.update(query, newPrice, id);

		return rows;
	}

}
