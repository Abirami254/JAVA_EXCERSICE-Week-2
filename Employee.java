package week2;

public class Employee {
	int empId;
	String empName;
	Employee(int id,String name){
		this.empId=id;
		this.empName=name;
	}
	void info(){
		System.out.println("Id: "+empId+" Name: "+empName);
		}
	public static void main(String args[]){
		Employee obj1 = new Employee(1749,"Nihar");
		Employee obj2 = new Employee(1849,"Nasrin");
		obj1.info();
		obj2.info();
		}
}
