package lab;

import java.util.Scanner;

public class Lab_3_2{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		String decision=null;
		System.out.println("enter an int");
		int n1=sc.nextInt();
		
	   
		if(n1%5!=0 && n1%7!=0) {
			decision= "No";
			
		}
		else if (n1%5==0 && n1%7==0){
		    decision="Divisible by both";
		 
		}
		else if (n1%5==0 && n1%7!=0) {
			decision="Invalid: Divisible by 5 Only";
		}
		else if (n1%5!=0 && n1%7==0) {
			decision="Invalid: Divisible by 7 Only";
		}
	
		System.out.println(decision);
	}
	
}
