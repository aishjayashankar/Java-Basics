package project1;

public class MainTest{
	
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
		MainTest obj1=new MainTest();
		MainTest obj2=obj1;
		System.out.println(new MainTest().y);
		System.out.println(z);
		System.out.println(obj1.z);
		System.out.println(MainTest.z);
		System.out.println(obj1);
		System.out.println(obj1.y);
		System.out.println(obj2.y);
		obj1.function1();
		System.out.println(obj1.i);
		System.out.println(obj1.a1.i);
		obj1.a1.funA();
		a1.funA();
		MainTest.a1.funA();
		//System.out.println(); similar
		

		int ar[]=new int[5];
		System.out.println(ar.length);
		
		for(int x1:ar)
			System.out.println(x1);


}
}
