package lab;
import java.util.Scanner;
public class Str_1 {
 public static void main(String[]args) {
	 Scanner sc= new Scanner(System.in);
	 String str1=sc.nextLine();
	 String str2="";
	 char a;
	 
	 for(int i=str1.length()-1; i>=0; i--) {
		
		 a=str1.charAt(i);
		 if(a==' ') {
		  str2=str2+a;
		 System.out.print(str2);
		 str2="";
		 
		 }
		 else
			 str2=a+str2;
		 
	 }
	 System.out.print(str2);
	 	 
	 sc.close();
	 
 }

}
