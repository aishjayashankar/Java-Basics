package project1;

import java.util.Scanner;

public class Studentclass {
	
	public static void main(String[] args){
		
		Student students[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			students[i]=new Student();
		

			System.out.println("Enter details of student "+(i+1));
			System.out.println("Roll");
			students[i].roll=sc.nextInt();
			System.out.println("Name");
			students[i].name=sc.next();
			System.out.println("Marks");
			students[i].marks=sc.nextInt();
		
		
		
			System.out.println("Details of student "+(i+1)+" are:");
			System.out.println("Roll");
			System.out.println(students[i].roll);
			System.out.println("Name");
			System.out.println(students[i].name);
			System.out.println("Marks");
			System.out.println(students[i].marks);
		}
		
	}
}
