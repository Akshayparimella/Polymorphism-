import java.util.Scanner;//import scanner package ,header file

public class MethodOverLoadingExample //class name
{
	int action()//default method
	{
		return 100;
	}
	int action(int x)//method with single parameter
	{
		return x*x;
	}
	int action(int x,int y)//method with double parameters
	{
		return x*x+y*y;
	}
    int action(int x,int y,int z)//method with multiple parameters
	{
		return x*x+y*y+z*z; //25+36+49
	}
public static void main(String[] args)//main function
	{
	MethodOverLoadingExample me=new MethodOverLoadingExample();//class name object=new class name
	int f,u,c;//variable initialization integer variable
	Scanner sc=new Scanner(System.in); //scanner class
	System.out.println("enter f,u and c values");//enter f,u,c values
	f=sc.nextInt();//object creation
	u=sc.nextInt();//object creation
	c=sc.nextInt();//object creation
	System.out.println("default method"+me.action());//default method calling
	System.out.println("method with single parameter"+me.action(f));//single parameter calling
	System.out.println("method with double parameters"+me.action(f,u));//double parameter calling
	System.out.println("method with multiple parameters"+me.action(f,u,c));//multiple parameter calling

	}

}
