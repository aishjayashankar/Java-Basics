package project1;

public class ToStrEx {
	
	public String toString(){
		String s="Welcome";
		return s;
	}
	public void println(Object o){
		String s=o.toString();
		println(s);
	}
	public void println(String s){
		//print
	}

	public static void main(String[] args) {
		ToStrEx obj1=new ToStrEx();
		//String s1=obj1.toString();
		System.out.println(obj1);//println calls toString

	}

}
