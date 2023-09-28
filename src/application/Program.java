package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.creatSellerDao();
		
		System.out.println("=== Test 1: Seller findByID ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 1: Seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerdao.findDepartment(dep);
		for(Seller sel : list) {
			System.out.println(sel);
		}

	}

}
