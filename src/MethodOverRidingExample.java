class baseclass//super class ,existing class ,parent class,base class 
{
	void action()//method creation is action()
	{
		System.out.println("base class method"); //refereed as final print as base class method
	}
}
class derivedclass extends baseclass //child class,derived class,sub class,new class 
{
	void action()//method creation is action
	{
		super.action(); //using super keyword used to call the parent class
		System.out.println("derived class method"); //refereed as final statement print as derived class
	}
}
public class MethodOverRidingExample //class name
{
public static void main(String[] args) //main function
	{
		derivedclass sc=new derivedclass();//method calling derived class and as well as object creation sc
		sc.action(); //object.method(); calling to method of derived class 
	}

}
