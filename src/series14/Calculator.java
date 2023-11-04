package series14;

public interface Calculator 
{
	double add(double a, double b);
	default double sqrt(double a)
	{
		return Math.sqrt(a); 
	}
	static double square(double a) 
	{ 
		return a * a; 
	}

}
