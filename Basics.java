package project1;

public class Basics{
	
	int y=10;
	int i;
	static int z=20;
	static A a1=new A();

	public void function1()
	{
		System.out.println("Inside function1");
	}
	
	public static void main(String[] args)
	{
		int x=10;
		System.out.println("Hello World!");
		System.out.println(x);
		Basics obj1=new Basics();
		Basics obj2=obj1;
		System.out.println(new Basics().y);
		System.out.println(z);
		System.out.println(obj1.z);
		System.out.println(Basics.z);
		System.out.println(obj1);
		System.out.println(obj1.y);
		System.out.println(obj2.y);
		obj1.function1();
		System.out.println(obj1.i);
		System.out.println(obj1.a1.i);
		obj1.a1.funA();
		a1.funA();
		Basics.a1.funA();
		//System.out.println(); similar
		

		int ar[]=new int[5];
		System.out.println(ar.length);
		
		for(int x1:ar)
			System.out.println(x1);


}
}
