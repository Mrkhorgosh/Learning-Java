package lab;
import java.util.Scanner;
public class Prime{    
	 public static void main(String args[]){    
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   boolean prime=true;
	   
	   for(int i=2;i<n;i++) {
		   if(n%i==0) {
			    prime=false;
			   break;
		   }
	   }
	   if(prime==true) {
		   System.out.printf("%d is a prime number",n);
	   }
	   else {
		   System.out.printf("%d is not a prime number",n);
	   }
	 }    
	} 