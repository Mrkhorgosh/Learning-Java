package lab;

import java.util.Scanner;
public class Lab6_4 {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if(i==n || j==1 || j==i) {
				System.out.print(j+" ");
			}
			else
			System.out.print("  ");
			
		
		
		}
	
		System.out.println();
		
	}
 
 
 }
}

