package PraticeTest;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value={
		"name",
		"empno",
		"salary"
})

public class EmpDetails implements Serializable {
	private int empno;
	private String name;
	private double salary;
	
	public EmpDetails()
	{
		
	}
	public EmpDetails(String name, int empno, int salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
