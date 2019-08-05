package project1;

public class TestInterface implements Intr{
	public void funX(){
		System.out.println("inside funX of Test");
	}
	public void funY(){
		System.out.println("inside funY of Test");
	}
	public void funZ(){
		System.out.println("inside funZ of Test");
	}
	
	public static void main(String[] args){
		Intr i1=new TestInterface();
		i1.funX();
		i1.funY();
		TestInterface obj1=(TestInterface)i1;
		obj1.funZ();
		System.out.println(Intr.x);
		
	}
}
