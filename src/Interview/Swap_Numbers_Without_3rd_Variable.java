package Interview;

public class Swap_Numbers_Without_3rd_Variable {

	
	public static void swap1()
	{
		int a=10; int b=20;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);	
	}
	
	public static void swap2()
	{
		int a=10; int b=20;
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println(a);
		System.out.println(b);
	}
	//largest no. from array
	public static void arr()
	
	{
		int a[]= {1,2,5,3,2,5,50};
		int l=a.length-1; int max=0;
		for(int i=0;i<=l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				if(a[j]>a[i])
						{
					max=a[j];
						}
			}		
		}
		System.out.println(max);
	}
	
  
	public static void main(int i)
	{
		System.out.println("this is overloaded method");
		
	}
	
	
	public static void main(String[] args) {
		arr();
		main(10);
	
		//swap2();
		
	}
}







