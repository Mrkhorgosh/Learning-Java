package lab;
import java.util.Scanner;
public class Ar_1 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the length of the array: ");
     int length = sc.nextInt();
     double[] array = new double[length];
     double max=0; double min=0;; double sum=0;
     int maxInd=0; int minInd=0;
     
     for(int i=0;i<array.length;i++) {
    	 System.out.println("Enter a number:");
    	 array [i]=sc.nextDouble();
    	 sum+=array[i];
    	 if(i==0) {
    		 max=array[i];
    	     min=array[i];
    	 }
    	 
    	 if (array[i]>max) {
    		 max=array[i];
    		 maxInd=i;
    	 }
    	 if(array[i]<min) {
    		 min=array[i];   
    		 minInd=i;
    	 }
     }
     
     double avg=sum/length;
     System.out.printf("Maximum element %f found at index %d\n",max,maxInd);
     System.out.printf("Minimum element %f found at index %d\n",min,minInd);
     System.out.printf("Summation: %f",sum);
     System.out.printf("Average: %f",avg);
 }
}
