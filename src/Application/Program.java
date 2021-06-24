package Application;


import java.util.List;
import java.util.Scanner;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;



public class Program {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}


		System.out.println("\n=== TEST 5: Update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		
		System.out.println("\n=== TEST 5: Update =====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);

	}
}