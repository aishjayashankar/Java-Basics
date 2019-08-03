package project1;

public class Cities {

	public void displaycities(String cities[]){
		if(cities!=null || cities.length!=0)
		{
		
			for(String x:cities)
				System.out.println(x);
		}
		else
			System.out.println("Enter valid details");
		
	}
	
	public static void main(String [] args){
		
		String cities[]={"Bangalore","Chennai","Noida","Gurgaon"};
		Cities obj1=new Cities();
		obj1.displaycities(cities);
	}
	
}
