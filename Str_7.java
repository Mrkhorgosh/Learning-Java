package lab;
import java.util.Scanner;
public class Str_7 {
 public static void main(String[]args) {
	 Scanner sc= new Scanner(System.in);
	 String inp=sc.nextLine();
	 String str1=sc.nextLine();
	 int count=0;
	 
	 
	 for(int i=0;i<inp.length()-1;i++) {
		 char a=inp.charAt(i);
		 char b=inp.charAt(i+1);
		 String test="";
		  test= test+a+b;
		  if(str1.equals(test)==true) {
			  count++;
		  }
		 
	 }
	 System.out.printf("Occurrence : %d",count);
	 
	 
	 
 }
}
