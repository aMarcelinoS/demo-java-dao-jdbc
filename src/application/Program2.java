package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findById ====");
		System.out.print("Enter the department Id you want to search: ");
		int id = sc.nextInt();	
		Department dep = departmentDao.findById(id);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("==== TEST 2: department findAll ====");
		
		List <Department> list = departmentDao.findAll();
		for (Department Dp : list) {
			System.out.println(Dp.getId() +" - "+ Dp.getName());
		}
		
		/*System.out.println();
		System.out.println("==== TEST 3: department insert ====");
		Department newDep = new Department(null, "Food");
		departmentDao.insert(newDep);
		System.out.println("Added with sucess!");*/
		
		System.out.println();
		System.out.println("==== TEST 4: department update ====");
		Department Dp = new Department(5, "Camping");
		departmentDao.update(Dp);
		System.out.println("Updated sucess!");
		

	}

}
