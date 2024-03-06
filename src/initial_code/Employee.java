package initial_code;

public class Employee {
	int salary;
	String name;
	 public void  getName() 
	 {
		name="Mahima";
	System.out.println(name);
		
	}
	 public void getSalary()
	 {
		 salary=10000;
		System.out.println(salary);
	 }
	 public void setName(String n)
	 {
		 name=n;
		 System.out.println(name);
	 }

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.getName();
		e.getSalary();
		e.setName("neha");

	}

}
