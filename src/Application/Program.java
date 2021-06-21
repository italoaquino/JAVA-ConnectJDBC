package Application;

import java.util.List;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n===Test 1: seller findByI===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("\n===Test 2: seller findByDepartment===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	
		System.out.println("\n===Test 3: seller findAll===");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
	
}
