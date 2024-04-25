package lab;
import java.util.Scanner;
public class Class_4eva {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int i=1;
	 
	 System.out.printf("Divisors of %d: \n",n);
	 
	 while(i<=n) {
		 if (n%i==0) {
			 System.out.println(i);
		 }
		 i++;
	 }	 	 
 }
}
