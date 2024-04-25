package lab;
import java.util.Scanner;

public class Lab4_5 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int i=0;
		int n1=n;
		 
		 
		 while(n1!=0) {
			 n1=n1/10;
			 i++;
			 }
		 double d = Math.pow(10, i-1);
		 System.out.printf("Total digit= %d\n",i);		
		 int n2=0;
		 for(int c=0;c<=i-1;c++) {
			if(c!=i-1) {
				n2=n/(int)d;
			System.out.printf("%d,",n2);
			 n=n%(int)d;
			 d=d/10;
			}
			else {
				n2=n/(int)d;
			System.out.printf("%d",n2);
			 n=n%(int)d;
			 d=d/10;
				
			}
			 
		 }
		 
	 }
	}