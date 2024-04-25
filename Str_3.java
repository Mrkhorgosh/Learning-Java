package lab;

import java.util.Scanner;

public class Str_3 {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 String str1=sc.nextLine();
		 String str2=sc.nextLine();
		 
		 for(int i=0;i<str1.length();i++) {
			 boolean dup =false;
			 for(int j=0;j<str2.length();j++) {
				 if(str1.charAt(i)==str2.charAt(j)) {
					 dup=true;
					
				 }
				 
			 }
			 if(dup==false) {
				 int a =(int)str1.charAt(i)-32;
				 System.out.print((char)a);
			 }
			 
		 }
		 for(int i=0;i<str2.length();i++) {
			 boolean dup =false;
			 for(int j=0;j<str1.length();j++) {
				 if(str2.charAt(i)==str1.charAt(j)) {
					 dup=true;
					
				 }
				 
			 }
			 if(dup==false) {
				 int a =(int)str2.charAt(i)-32;
				 System.out.print((char)a);
			 }
			 
		 }
		 sc.close();
		 
 }
}
