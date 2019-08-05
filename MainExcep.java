package project1;

public class MainExcep {
	/*public void fun1(String num1,String num2){
		System.out.println("inside fun1 of MainEx");
		
		A a1=null;
		
		int i=Integer.parseInt(num1);
		int j=Integer.parseInt(num2);
		
		int k=i/j;
		
		if (k>12)
			a1=new A();
		
		a1.funA();
		System.out.println("end of fun1 of MainEx");
		
	}*/
	public void fun1(int age)throws InvalidAgeException{
		if (age<18){
			InvalidAgeException ex1=new InvalidAgeException();
			throw ex1;
		}
	}
	public static void main(String[] args){
		System.out.println("main starts");
		MainExcep obj1=new MainExcep();
		try{
			//obj1.fun1("130", "10");
			obj1.fun1(11);
		}
		catch(InvalidAgeException e){
			//System.out.println("try again");
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("end of main");
		
	}

}
