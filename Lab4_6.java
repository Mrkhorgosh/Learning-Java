package lab;

import java.util.Scanner;

public class Lab4_6 {
 public static void main(String[]args) {
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt(); 
	 boolean prime=true;
	 for(int i=2;i<n;i++) {
		 
		 if(n%i==0) {
			 prime=false;
			 System.out.printf("%d is not a prime number\n",n);
			 break;
		 }
		 
	 }
	 if(prime) {
		 System.out.printf("%d is a prime number.\n",n);
	 }
	 int sum=0;
    for(int j=1;j<n;j++) {
    	if(n%j==0) {
    		sum=sum+j;
    	}
    }
    if(n==sum) {
    	System.out.printf("%d is a pefect number.",n);
    }
    else {
    	System.out.printf("%d is not a pefect number.",n);
    }
 }
}
