package PraticeTest;

public class Test {

	public static void main(String[] args) throws Exception {
		EmpDetails e = new EmpDetails("Ram",123,50000);
		JSONParser1.marshalling(e);
        System.out.println("pass");
	}

}
