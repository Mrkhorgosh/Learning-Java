package lab;

import java.util.Scanner;

public class Lab_3_1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter an  int:");
		int n1=sc.nextInt();
		System.out.println("enter opertation:");
		String op=sc.next();
		System.out.println("enter an int:");
		int n2=sc.nextInt();
		
	    if(op.equals("+")) {
	    	System.out.print(n1+n2);
	    }
	   
	    else if(op.equals("-")) {
	    	System.out.print(n1-n2);
	    }
	    else if(op.equals("*")) {
	    	System.out.print(n1*n2);
	    }
	    else if(op.equals("/")) {
	    	System.out.print(n1/n2);
	    }
	}
    

}
