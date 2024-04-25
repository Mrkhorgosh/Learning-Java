package lab;
import java.util.Scanner;
public class Ar_4 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please enter the length of array");
	 int l=sc.nextInt();
	 int []arr= new int[l];
     
	
     System.out.println("Please enter the elements of the array");
	 for(int i=0;i<l;i++) {
		 arr[i]=sc.nextInt();		 
	 }
	 
	 System.out.println("please enter the targeted value");
	 int t=sc.nextInt();
	 boolean found=false;
	 for(int i=0;i<l;i++) {
		 for(int j=0;j<l;j++) {
			 if(j!=i) {
			 if(arr[i]+arr[j]==t) {
				 System.out.printf("Elements need to be added: %d %d\n",arr[i],arr[j]);
				 System.out.printf("Index of the elements: %d and %d",i,j);
				 found=true;
				 break;
			 }
			 if(found==true)
				 break;
			 }
		
		 }
		 
	 }
	 if(found==false)
		 System.out.println("target value not found");
	 
	 
 }
}
