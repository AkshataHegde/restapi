package com.akshata.restapi;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import com.akshata.restapi.ProductDAOimpl;
import com.akshata.restapi.Product;

@Path("/Product")
public class productService 
{
	@GET
	@Path("/productdetails")
	@Produces("application/json")
	public String getProductDetails()
	{
		String ProductDetails=null;
		List<Product> productList=null;
		
		ProductDAOimpl productdaoimpl=new ProductDAOimpl();
		productList=productdaoimpl.getProductDetails();
		Gson gson=new Gson();
		ProductDetails=gson.toJson(productList);
		return ProductDetails;
	}
}




