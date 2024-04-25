package lab;
import java.util.Scanner;
public class Lab4_4 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int i=0;
	int n1=n;
	 
	 
	 while(n1!=0) {
		 n1=n1/10;
		 i++;
		 }
	 
	 System.out.printf("Total digit= %d\n",i);
	
	
	 
 }
}
