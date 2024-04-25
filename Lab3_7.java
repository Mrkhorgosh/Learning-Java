package lab;

import java.util.Scanner;

public class Lab3_7{
	public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 int n100=0;
		 int n50=0;
		 int n20=0;
		 int n10=0;
		 int n5=0;
		 int n2=0;
		 int n1=0;
		 System.out.println("Enter the amount the customer need to pay");
		 int bil=sc.nextInt();
		 System.out.println("Enter the amount, customer gave(Taka)");
		 int paid=sc.nextInt();
		 
         if (paid>bil){
			 int b=paid-bil;
			 System.out.printf("The returned amount is %d\n",b);
			 
		  if(b>=100) {
			n100=b/100;
			b = b-(n100*100);
				 
		  }
		  if(b>=50) {
			  n50=b/50;
			  b=b-(n50*50);
		  }
		  if(b>20) {
			  n20=b/20;
			  b=b-(n20*20);
			   }
		  if(b>10) {
			  n10=b/10;
			  b=b-(n10*10);
		  }
		  if(b>=5) {
			  n5=b/5;
			  b=b-(n5*5);
		  }
		  if(b>=2) {
			  n2=b/2;
			  b=b-(n2*2);
		  }
		  if(b>=1) {
			  n1=b/1;
			  
		  }
		}
		 else {
			int a=bil-paid;
			 System.out.printf("Please pay %d taka more.",a);
		}
		 
         System.out.printf("100 taka note: %d\n",n100);
         System.out.printf("50 taka note: %d\n",n50);
         System.out.printf("20 taka note: %d\n",n20);
         System.out.printf("10 taka note: %d\n",n10);
         System.out.printf("5 taka note: %d\n",n5);
         System.out.printf("2 taka note: %d\n",n2);
         System.out.printf("1 taka note: %d\n",n1);
	}
}