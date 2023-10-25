package series12;

public class StudentWithDefaultGrade extends Person{
	private double grade = 10.0;
	StudentWithDefaultGrade(String name, int age, double grade) {
		super(name, age);
		this.grade = 10;
		// TODO Auto-generated constructor stub
	}
	public double getGrade()
	{
		return grade;
	}

}
