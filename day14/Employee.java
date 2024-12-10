package day14;

public class Employee {
	String name;
	String Dept;
	int age;
	int mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "\n Dept=" + Dept + "\n age=" + age + "\n mobileNo=" + mobileNo + "]";
	}
	public Employee(String name, String dept, int age, int mobileNo) {
		super();
		this.name = name;
		Dept = dept;
		this.age = age;
		this.mobileNo = mobileNo;
	}



}
