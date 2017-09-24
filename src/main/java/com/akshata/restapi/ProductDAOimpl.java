package com.akshata.restapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.akshata.restapi.Product;


public class ProductDAOimpl {
	public List<Product> getProductDetails() {
		List<Product> ProductData=new ArrayList<>();
		JDBCconnection jdbcConnection = new JDBCconnection();
		
		Connection connection = jdbcConnection.getConnection();
		
		
		try
		{
			PreparedStatement ps = connection.prepareStatement("select * from mydatabase.product");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Product product = new Product();
				product.setProductID(rs.getInt("productID"));
				product.setProductname(rs.getString("productname"));
				product.setProductcID(rs.getInt("productcID"));
				product.setProductPrice(rs.getInt("productPrice"));
				ProductData.add(product);
				
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return ProductData;
	}
}
				
				
				
				
	
	
	
	
