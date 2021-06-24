package Model.dao;

import java.util.List;

import Model.entities.Department;
import Model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	void insertId(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	Seller findById(Integer id);

}
