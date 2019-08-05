package project1;

public class MainAll {

	{
		System.out.println("inside non static block");
	}
	static{
		System.out.println("inside static block");
	}
	public MainAll() {
		System.out.println("inside constructor");
	}
	public void fun1(){
		System.out.println("inside fun1 of MainAll");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");
		MainAll m1=new MainAll();
		m1.fun1();
	}

}
