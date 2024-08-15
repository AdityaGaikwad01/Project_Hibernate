package com.tka.controller;
import java.util.Scanner;

import com.tka.entity.Product;
import com.tka.service.ProductService;
import com.tka.utility.ProductUtility;
public class ProductController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SessionFactory sf = HibernateConfig.getSessionFactory();
//		
//		System.out.println("done");
		
		
		ProductService productService = new ProductService();
		
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean wantToTerminate = false;
		
		do {
			
			System.out.println("Press 1 For Add Product");
			System.out.println("Press 2 For Get Product");
			System.out.println("Press 3 For Delete Product");
			System.out.println("Press 4 For Update Product");

			System.out.println("Press 0 for Terminate");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				Product product = ProductUtility.prepareProductData();

				String msg = productService.addProduct(product);
				System.out.println(msg);

				break;
			}

			case 2: {
				System.out.println("Eneter Id");
				long productId = scanner.nextLong();

				Object obj = productService.getProductById(productId);
				System.out.println(obj);
				break;
			}
			case 3:{
				System.out.println("Enter Id");
				long productId = scanner.nextLong();
				ProductService ps = new ProductService();
				String msg = ps.deleteProductById(productId);
				System.out.println(msg);
			}
			case 4:{
				System.out.println("Enter Id");
				
			}
			

			case 0: {
				wantToTerminate = true;
			}

			default:
				System.out.println("Invalid Choice....");
			}

		} while (wantToTerminate);
		scanner.close();

	}

}
