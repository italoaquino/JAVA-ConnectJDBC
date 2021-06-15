package Application;

import java.sql.Date;

import Model.entities.Department;
import Model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");

		Seller seller = new Seller(21, "bob", "boob@gmail.com", new Date(1), 2000.0 , obj);

		
		System.out.println(obj);
		System.out.println(seller);
	}
	
}
