package lab;
import java.util.Scanner;
public class Ar_5 {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the length of array");
		 int l=sc.nextInt();
		 int []arr= new int[l];
		 for(int i=0;i<l;i++) {
			 System.out.println("Enter a number:");
			 arr[i]=sc.nextInt();		 
		 } 
		 System.out.println("Original Array: ");
		 for(int i=0;i<l;i++) {
			 System.out.print(arr[i]+" ");			 			 
		 }
		 System.out.println();
		 for(int i=0;i<l-1;i++) {
			 int test=i;
			 for(int j=i+1;j<l;j++) {
				 if(arr[test]<arr[j])
					 test=j;
			 }
			 int temp= arr[test];
			 arr[test]=arr[i];
			 arr[i]=temp;  
		 }
		 System.out.println("Sorted Array: ");
		 for(int i=0;i<l;i++) {
			 System.out.print(arr[i]+" ");			 			 
		 } 
  }
}
