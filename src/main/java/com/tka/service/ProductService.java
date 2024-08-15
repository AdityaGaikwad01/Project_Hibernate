package com.tka.service;
import com.tka.dao.*;
import com.tka.entity.*;

import java.util.Date;
import java.text.SimpleDateFormat;


public class ProductService {
	
	
	
	ProductDao productDao  = new ProductDao();
	

	public String addProduct(Product product) {
		
		// This is business logic 
		// give the id according to current time stamp 
		 String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		 product.setProductID(Long.parseLong(productId));
		
		String msg = productDao.addProduct(product);
		return msg;
		
	}
	public Object getProductById(long productId) {
		Object obj = productDao.getProductById(productId);
		
		return obj;
	}
	
	public String  deleteProductById(long productId) {
		
		String deleteProductById = productDao.deleteProductById(productId);
		return deleteProductById;
		
	}
	
	public String  updateProduct(Product product) {
		return null;
	}

}
