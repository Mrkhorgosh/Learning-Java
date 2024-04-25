package lab;

import java.util.Scanner;

public class Lab3_6 {
	public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 double n1=sc.nextDouble();
		 double n2=sc.nextDouble();
		 double n3=sc.nextDouble();
		 String a=null;
		 String b=null;
		
		 
		 if (n1>n2 && n1>n3) {
			 System.out.printf("Maximum number is %f\n",n1);
			 if(n2>n3) {
				 System.out.printf("Minimum number is %f",n3);
			 }
			 else {
				 System.out.printf("Minimum number is %f",n2);
			 }
			 
			 
		 }
		 else if (n2>n1 && n2>n3) {
			 System.out.printf("Maximum number is %f\n",n2);
			 if(n1>n3) {
				 System.out.printf("Minimum number is %f",n3);
			 }
			 else {
				 System.out.printf("Minimum number is %f",n1);
			 }
			 
			 
		 }
		 else if (n3>n2 && n3>n1) {
			 System.out.printf("Maximum number is %f\n",n3);
			 if(n2>n1) {
				 System.out.printf("Minimum number is %f",n1);
			 }
			 else {
				 System.out.printf("Minimum number is %f",n2);
			 }
			 
			 
		 }
		
	}
	
}
