package lab;

import java.util.Scanner;

public class Lab3_8 {
	public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Input the 1st number:");
		 int n1=sc.nextInt();
		 System.out.println("Input the 2nd number:");
		 int n2=sc.nextInt();
		 System.out.println("Input the 3rd number:");
		 int n3=sc.nextInt();
		 
		 if(n1!=n2 && n1!=n3 && n2!=n3) {
			 System.out.print("All numbers are different");
		 }
		 else if(n1==n2 && n2==n3 ) {
			 System.out.print("All numbers are equal");
			 
		 }
		 else {
			 System.out.print("Neither all are equal or different");
		 }
		 
	}

}
