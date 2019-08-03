package project1;

public class Child extends Parent{
	/*public void fun1(){
		System.out.println("inside fun1 of child");
	}*/
	
	public void funcA(){
		System.out.println("inside funcA of child");
	}
	public void fun2(){
		System.out.println("inside fun2 of child");
		funcA();
		super.funcA();
	}
	
	public static void main(String[] args){
		Child obj1=new Child();
		
		obj1.fun2();
		//obj1.super.funcA(); cant use super under static block
		
		Parent obj2=new Child();
		obj2.fun1();
		obj2.funcA();
		
		Child obj3=(Child)obj2;// downcasting
		obj3.fun2();
	}
}
