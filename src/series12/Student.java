package series12;

public class Student extends Person{
	private double grade;
	Student(String name, int age, double grade) {
		super(name, age);
		this.grade = grade;
	}
	public double getGrade()
	{
		//System.out.println("Grade : "+ grade);
		return   grade;
	}
}
