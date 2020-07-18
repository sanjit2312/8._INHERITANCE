package inheritance;

public class Multi_Level_Inheritance 
{

	public static void main(String[] args)
	{
		
		Grandson obj=new Grandson();
		obj.getdata(10,20);            //  calling method of super class
		obj.disp();                    //  calling method of sub class


	}

}
class Father
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
}
class son extends Father
{
	int c=30;
	int add()
	{
		int sum=a+b+c;
		return(sum);
	}
}
class Grandson extends son
{
	void disp()
	{
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println("C= "+c);
		System.out.println("Sum= "+add());
	}
}
