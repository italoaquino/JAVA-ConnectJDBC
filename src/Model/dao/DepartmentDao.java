package Model.dao;

import java.util.List;
import Model.entities.Department;

public interface DepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void insertId(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
