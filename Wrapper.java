package project1;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args){
		//wrapper usecase1
		int x=10;
		Integer i1=new Integer(x);//primitive to obj
		int y=i1.intValue();//obj to primitive
		
		//from java1.5
		Integer i2=x;
		y=i2;
		
		//wrapper usecase2
		String s="10 ";
		int i=Integer.parseInt(s.trim());
		System.out.println(i+1);
		
		//wrapper usecase3
		int i3=10;
		String s1=i3+"";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll");
		int roll=sc.nextInt();
		System.out.println("Name");
		String name=sc.next();
		System.out.println("Marks");
		int marks=sc.nextInt();
		
		System.out.println(roll+"\t"+name+"\t"+marks);
	}
}
