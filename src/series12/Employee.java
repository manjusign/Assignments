package series12;

public class Employee {
	protected String name;
	protected String employeeId;
	protected double salary;
	 Employee(String name, String employeeId, double salary)
	 {
		 this.name = name;
		 this.employeeId = employeeId;
		 this.salary = salary;
	 }
	 public String  getName()
	 {
		 return name;
	 }
	 public String getEmployeeId()
	 {
		 return employeeId;
	 }
	 public double getSalary()
	 {
		 return salary;
	 }
}
