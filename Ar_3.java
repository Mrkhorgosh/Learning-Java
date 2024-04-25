package lab;
import java.util.Scanner;
public class Ar_3 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please enter the length of array 1");
	 int l1=sc.nextInt();
	 int []arr1= new int[l1];
     
	
     System.out.println("Please enter the elements of the arr1");
	 for(int i=0;i<l1;i++) {
		 arr1[i]=sc.nextInt();		 
	 }
	 System.out.println("Please enter the length of array 2");
	 int l2=sc.nextInt();
	 int[]arr2= new int[l2];
	 System.out.println("Please enter the elements of the arr2");
	 for(int i=0;i<l2;i++) {
		 arr2[i]=sc.nextInt();	
	 }
	 boolean set=false;
	 for(int i=0;i<l2;i++) {
		  set=false;
		 for(int j=0;j<l1;j++) {
			 if(arr2[i]==arr1[j]) {
				 set=true; 
			 break;
			 }
			 if(set==false)
				 break;
			 
		 }
	 }
	 
	 if(set==true)
		 System.out.print("Array 2 is a subset of Array 1." );
	 
	 else
		 System.out.print("Array 2 is not a subset of Array 1." );
 }
}
