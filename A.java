package project1;

public class A {
	
	int i=20;

	public A(){
		//calling second constructor
		
		System.out.println("inside A() constructor");
		
	}
	public A(int i){
		this();
		System.out.println("inside A(int) constructor");
	}
	public A(String s){
		this(10);
		System.out.println("inside A(String) constructor");
	}
	public void funA()
	{
		int i=50;
		System.out.println("inside Function A");
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void main(String[] args){
		
		A a1=new A("hello");
		a1.funA();
	}
}
