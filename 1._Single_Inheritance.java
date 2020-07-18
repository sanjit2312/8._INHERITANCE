package inheritance;

public class Single_Inheritance 
{

	public static void main(String[] args)
	{
		
		Daughters obj=new Daughters();
		obj.getdata(10,20);    //  calling method of super class
		obj.disp();

	}

}
class Mother      //  super class
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Daughters extends Mother         //sub class
{
	int add()
	{
		int sum=a+b;
		return(sum);
	}
	void disp()
	{
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println("Sum= "+add());
	}
}
