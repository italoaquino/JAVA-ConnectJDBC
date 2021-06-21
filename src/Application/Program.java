package Application;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findById(2);
		
		System.out.println(seller);
	}
	
}
