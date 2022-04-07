package Practice;

import org.apache.poi.poifs.property.Child;

public class Parent_Casting_Child  extends Parent_Casting{
	public void m1()
	{
		System.out.println("Child class method 1");
	}
	public void m2()
	{
		System.out.println("Child class method 2");
	}
	public void m3()
	{
		System.out.println("Child class method 3");
	}
	public void m4()
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
//		Parent_Casting_Child pc=new Parent_Casting_Child();
//		pc.m1();
//		pc.m2();
//		pc.m3();
//		pc.m4();
		
		Parent_Casting p=new Parent_Casting_Child();
//		p.m1();
//		p.m2();
//		p.m3();
	   System.out.println("This is Downcasting");
//	   Parent_Casting p=new Parent_Casting_Child();
	   Parent_Casting_Child c= (Parent_Casting_Child)p;	
	   c.m1();
	   c.m4();
	}

}
