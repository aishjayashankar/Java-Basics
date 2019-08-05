package project1;

public class MainIntr {
	
	/*public void func5(){
		System.out.println("inside fun5 of MainIntr");
	}
	public void funTest(Intr i1){
		
		if(i1!=null)
		{
		System.out.println("inside funTest of MainIntr");
		i1.funX();
		i1.funY();
		}
		else
			System.out.println("Can't specify null");
	}*/
	
	/*public Parent funTest(){
		System.out.println("inside funTest of MainIntr");
		return new Parent();
	}*/
	
	/*public Intr funTest(){
		
		System.out.println("inside funTest of MainIntr");
		return new IntrImpl();
		//return new IntrImpl2();
		//return null;
	}
	*/
	
	/*public Hotel getHotel(int amt){
		Hotel h=null;
		
		if(amt>=500)
			h=new TajHotel();
		else
			h=new RandomHotel();
		
		return h;
	}*/
	public static void main(String[] args){
		
		//MainIntr obj1=new MainIntr();
		//obj1.func5();
		//Parent p1=obj1.funTest();
		//Object obj=obj1.funTest();
		//Intr i1=obj1.funTest();
		
		//Intr i=new IntrImpl();
	/*	MainIntr hot=new MainIntr();
		
		Hotel h=hot.getHotel(600);
		h.biriyani();
		h.masalaDosa();
		*/
		
		int x=100;
		int y=0;
		
		try{
			
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
	}

}
