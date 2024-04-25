package lab;
import java.util.Scanner;
public class Lab_3_3 {
	 public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 double x=sc.nextDouble();
		 
		
		 double fx1=2*x;
		 double fx2=x+2;
		 double fx3=Math.pow(x,2)-1;
		 double fx4=(3*Math.pow(x,2))+2;
		 
		 if(x<2) {
			 System.out.printf("Output: %f",fx1);
			 
		 }
		 
		 else if(0<=x && x<2) {
			 System.out.printf("Output: %f",fx2);
		 }
         else if(2<=x && x<5) {
        	 System.out.printf("Output: %f",fx3);
		 }
				
         else if(x>=5) {
        	 System.out.printf("Output: %f",fx4);
        	 
         }
		 
	
	 }

}
