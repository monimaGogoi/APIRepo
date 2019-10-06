package PraticeTest;

import java.io.File;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		File f= new File("./EmpDetails.json");
		JSONParser2<EmpDetails> jp=new JSONParser2<EmpDetails>();
		EmpDetails m = jp.unmarshalling(f, EmpDetails.class);
		System.out.println(m.getEmpno());
		System.out.println(m.getName());
		System.out.println(m.getSalary());
		System.out.println("pass");

	}

}
