package lab;
import java.util.Scanner;
public class Lab3_4 {
	public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 int id=sc.nextInt();
		 int n1=id/100000;
		 int y=n1/10;
		 int sem=n1%10;
		 
		 if(sem==1) {
			 System.out.printf("Student Joined BRAC in Spring %d",y);
		 }
		 else if(sem==2) {
			 
			 System.out.printf("Student Joined BRAC in Summer %d",y);
		 }
		 
         else if(sem==3) {
			 
        	 System.out.printf("Student Joined BRAC in Fall %d",y);
		 }
		 
		 
		 
	}	 
}
