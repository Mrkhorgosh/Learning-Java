package lab;
import java.util.Scanner;
public class Str_5 {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 String str1=sc.nextLine();
	 String str2=sc.nextLine();
	 String str3="";
	 
	 for(int i=0;i<str1.length();i++) {
		 boolean dup =false;
		 str3=str3+str1.charAt(i);
		 for(int j=0;j<str2.length();j++) {
			 char a=str1.charAt(i);
			 char b=str2.charAt(j);
			 if(a>='A' && a<='Z') {
				 int n1=(int)a+32;
				 a=(char)n1;
			 }
			 if(b>='A' && b<='Z') {
				 int n2=(int)b+32;
				 b=(char)n2;
			 }
			 if(a==b) 
				 dup=true;						 
		 }
		 if(dup==false) 
				System.out.print(str1.charAt(i));	 
	 }
	 sc.close();	 
 }
}
