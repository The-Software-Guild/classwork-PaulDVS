package util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entities.product;

public class ProductRowMapper implements RowMapper<product> {

	@Override
	public product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		long id=resultSet.getLong("productID");
		String code=resultSet.getString("productCode");
		String name=resultSet.getString("productName");
		String desc=resultSet.getString("productDesc");
		double price=resultSet.getDouble("productPrice");

		product product= new product(id, code, name, desc, price);

		return product;
	}

	
}
