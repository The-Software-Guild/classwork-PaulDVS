package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.product;

public class ProductDoaImpl implements ProductDoa {

	@Override
	public List<product> getProductList() {
		List<product> productList=new ArrayList<product>();
		Connection connection=null;
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "lychee");
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM PRODUCT");
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				long id=resultSet.getLong("productID");
				String code=resultSet.getString("productCode");
				String name=resultSet.getString("productName");
				String desc=resultSet.getString("productDesc");
				double price=resultSet.getDouble("productPrice");
	
				
				product product= new product(id, code, name, desc, price);
				
				productList.add(product);
			}
			
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return productList;
		
		
		
		
	}

	@Override
	public int insertRecord(product product) {
		Connection connection=null;
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "lychee");
			
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?)");
			preparedStatement.setLong(1, product.getProductID());
			preparedStatement.setString(2, product.getCode());
			preparedStatement.setString(3,product.getName());
			preparedStatement.setString(4, product.getDesc());
			preparedStatement.setDouble(5, product.getPrice());
			
			int rows= preparedStatement.executeUpdate();
			return rows;
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public product getRecordById(int id) {
		product product = null;
		Connection connection=null;
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "lychee");
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM PRODUCT WHERE productID=?");
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				long prodID=resultSet.getLong("productID");
				String code=resultSet.getString("productCode");
				String name=resultSet.getString("productName");
				String desc=resultSet.getString("productDesc");
				double price=resultSet.getDouble("productPrice");
	
				product= new product(prodID, code, name, desc, price);
			}
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public int deleteRecord(int id) {
		Connection connection=null;
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "lychee");
			
			PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM PRODUCT WHERE productID=?");
			preparedStatement.setInt(1, id);
			
			int rows= preparedStatement.executeUpdate();
			return rows;
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updatePrice(int id, double newPrice) {
		Connection connection=null;
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "lychee");
			
			PreparedStatement preparedStatement=connection.prepareStatement("UPDATE PRODUCT SET productPrice = ? WHERE productID=?");
			preparedStatement.setDouble(1, newPrice);
			preparedStatement.setInt(2, id);
			
			int rows= preparedStatement.executeUpdate();
			return rows;
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

}
