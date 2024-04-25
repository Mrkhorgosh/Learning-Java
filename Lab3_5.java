package lab;
import java.util.Scanner;
public class Lab3_5 {
	public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 double i=sc.nextDouble();
		 double age=sc.nextInt();
		 
		 int p=0;
		 
		 
         if(age>=18) { 
		 
		           if(i<10000) {
			              p=0;
		                }
		            else if(i>=10000 && i<=20000) {
			              p=5;			 
		                }
		            else if( i>20000) {
			              p=10;			 
		                }	
         }
         else {
        	  p=0;
         }
         double t=(i*p)/100;
         
         System.out.printf("Your tax amounts in %f Tk",t);
	}
}
