package Model.dao;

import java.util.List;


import Model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void insertId(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
