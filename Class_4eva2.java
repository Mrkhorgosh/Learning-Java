package lab;

import java.util.Scanner;

public class Class_4eva2 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter an integer");
		  int  n=sc.nextInt();
		  int  i=1;
		  int neg=0;
		  int pos=0;
		  while(i<=n) {
			  System.out.printf("Enter number %d:",i);
			  int d=sc.nextInt();
			  if(d>=0) {
				  pos++;
			  }
			  else {
				  neg++;
			  }
			  i++;
		  }
		  System.out.printf("%d Non-Negative numbers\n",pos);
		  System.out.printf("%d  Negative numbers",neg);
	}
}
