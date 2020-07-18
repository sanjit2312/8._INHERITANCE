package inheritance;

public class Hierarchical_Inheritance 
{

	public static void main(String[] args)
	{
		
		Sons objS=new Sons();
		Daughter objD=new Daughter();
		
		objS.getdata(10,20);          //  calling method of super class
		objS.disp();                  //  calling method of sub class
		objD.getdata(30,40);          //  calling method of super class
		objD.disp();                  //  calling method of sub class

	}

}
class Uncle                    //   super class
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Sons extends Uncle
{
	int sum()
	{
		int add=a+b;
		return(add);
	}
	void disp()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Sum= "+sum());
	}
}

class Daughter extends Uncle
{
	int mul()
	{
		int multi=a*b;
		return(multi);
	}
	void disp()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Multiplication= "+mul());
	}
}
