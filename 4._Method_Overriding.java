package inheritance;

public class Method_Overriding 
{

	public static void main(String[] args)
	{
		
		Result r=new Result();
		Mark m=new Mark();
		Grade g=new Grade();
		
		r.cal();       //  calling method of super class
		m.cal();       //  calling method of sub class
		g.cal();       //  calling method of sub class

	}

}
class Result
{
	int a=100;
	void cal()
	{
		System.out.println("Super class father\n");
	}
}
class Mark extends Result
{
	int b=200;
	void cal()
	{
		int sum=a+b;
		System.out.println("Sub class son");
		System.out.println("Addition="+sum);
	}
}
class Grade extends Result
{
	int c=20;
	void cal()
	{
		int mult=a*c;
		System.out.println("Sub class Daughter");
		System.out.println("Multiplication="+mult);

	}

}
