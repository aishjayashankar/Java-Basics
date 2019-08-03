package project1;

public class MarksOverride {
	
	public String toString(){
		Student obj2=new Student();
		obj2.name="aishwarya";
		obj2.roll=11;
		obj2.marks=99;
		String s=""+obj2.name+"\t"+obj2.roll+"\t"+obj2.marks;
		return s;
	}
		
		
	public static void main(String[] args) {
		MarksOverride obj1=new MarksOverride();
		//String s1=obj1.toString();
		System.out.println(obj1);//println calls toString

	}
}
