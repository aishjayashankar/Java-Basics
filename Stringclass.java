package project1;

public class Stringclass {
	public static void main(String[] args){
		//String s1=new String("hello");
		String s2="hello";
		String s3=s2.replace('e','a');
		//A a1=new A("hello");
		//System.out.println(s3==s2);
		//System.out.println(s1.equals(s2));\
		//System.out.println(s3);
		//StringBuffer sb=new StringBuffer("hello1");
		//System.out.println(sb);
		//char ch[]=s3.toCharArray();
		StringBuffer sb1=new StringBuffer(s3);
		sb1.reverse();
		s3=sb1.toString();
		System.out.println(s3);

	}
}
