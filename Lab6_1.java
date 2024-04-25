package lab;
import java.util.Scanner;
public class Lab6_1 {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int r=sc.nextInt();
	
	for(int i=1;i<=r;i++) {
		for(int j=n;j>=1;j--) {
			System.out.print(j+" ");
			
		}
		System.out.println();
	}
 
 
 }
}
