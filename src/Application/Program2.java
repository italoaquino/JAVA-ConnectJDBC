package Application;

import java.util.List;
import java.util.Scanner;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: seller Department=====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		
		System.out.println("\n=== TEST 2: FindAll=====");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: DeleteById=====");
		System.out.println("Enter Id for delete:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		
		System.out.println("\n=== TEST 3: Update=====");
		dep.setName("Cooking");
		departmentDao.update(dep);
		System.out.println("Update ok!");
	}
}