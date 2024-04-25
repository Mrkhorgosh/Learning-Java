package lab;

import java.util.Scanner;
public class Lab6_7 {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		for(int d=1;d<=(2*i-1);d++) {
			
			if(d==1 || d==2*i-1) {
			System.out.print(d);
			}
			else
				System.out.print(" ");
		
		}
		
		System.out.println();
	}
	 
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		for(int d=1;d<=(2*i-1);d++) {
			
			if(d==1 || d==2*i-1) {
			System.out.print(d);
			}
			else
				System.out.print(" ");
		}
		
		System.out.println();
	 }
	
	}
 
 
 }