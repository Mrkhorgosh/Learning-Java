package lab;
import java.util.Scanner;
public class lab4_1 {
  public static void main(String[]args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Input the number of terms:");
	  int n=sc.nextInt();
	  int o=1;
	  int i=1;
	  int sum=0;
	  System.out.println("The odd numbers are:");
	  while(o<=n) {
		  if(i%2!=0) {
			  System.out.println(i);
			  o++;
			  sum=sum+i;
		  }
		  i++;		  
	  }
	  System.out.printf("The Sum of odd Natural Numbers up to %d terms is:%d",n,sum);
  }
}
