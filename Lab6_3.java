package lab;

import java.util.Scanner;
public class Lab6_3 {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	int l=sc.nextInt();
    int w=sc.nextInt();
    
    for(int i=1;i<=w;i++) {
    	
    	for(int j=1;j<=l;j++) {
    		if(i==1 || j==1 || i==w ||j==l) { 
    		
    		 System.out.print(j+" ");
    		}
    		else {
    			
    				System.out.print("  ");
    			
    		}
    		
    		}
    		
    	System.out.println();
    	}
    	
    }
 }
