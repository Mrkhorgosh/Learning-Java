package lab;

import java.util.Scanner;

public class lab4_2 {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		
		 int sum=0;
		 
		 for(int i=0;i<=10;i++) {
			 
				 
				 System.out.println("Enter number :");
				 int n=sc.nextInt();
			 sum=sum+n;
			 System.out.printf("Sum=%d\n",sum);
			 
		 }
	 }
	

}
