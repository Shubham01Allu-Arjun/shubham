package Anudip;

public class Member  {
	//default method
	public Member() {
		super();
	}
	//Parameterized constructor
	public Member(String name, int age, String contact, String address,String Salary) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.Salary=Salary;
	}
	//method to print salary 
	String printSalary() {
		return Salary;
	}
	//data members
	String name;
    int age;
    String contact;
    String address;
    String Salary;

}