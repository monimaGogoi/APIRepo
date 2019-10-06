package PraticeTest;

import java.io.File;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		File f= new File("./EmpDetails.json");
		EmpDetails m = JSONParser1.unmarshalling(f, EmpDetails.class);
		System.out.println(m.getEmpno());
		System.out.println(m.getName());
		System.out.println(m.getSalary());
		System.out.println("pass");

	}

}
