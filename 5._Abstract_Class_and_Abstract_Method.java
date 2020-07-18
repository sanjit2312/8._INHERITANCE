package inheritance;

public class Abstract_Class_and_Abstract_Method 
{

	public static void main(String[] args)
	{
		
		Brother b=new Brother();
		Sister s=new Sister();
		b.disp();
		s.disp();
		
	}

}

abstract class Parent
{
	abstract void disp();
}
class Brother extends Parent
{
	
	void disp()
	{
		System.out.println("Sanjit");
	}
}
class Sister extends Parent
{
	void disp()
	{
		System.out.println("Kumar");
	}
}