package lab;

import java.util.Scanner;
public class Str_4 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 String str1=sc.nextLine();
		 String str2="";
		 int count=0;
		  
		 for(int i=0;i<str1.length();i++) {
			 char a=str1.charAt(i);
			 
			 if(a>='A'&& a<='Z' || a>='a'&& a<='z') {
				 count++;	 
			 }
			 if(i==0) {
				 if(a>='A' && a<='Z') {
					 int n1=(int)a+32;
					 a=(char)n1;					 				 
			  }
			 }
			 else if(i>=0) {
				 if((int)a>=97 && (int)a<=122 && count%2==0) {
					 int n2=(int)a-32;
					 a=(char)n2;	 
				  }
				 else if((int)a>=65 && (int)a<=90 && count%2!=0) { 
					 int n3=(int)a+32;
					 a=(char)n3;	 
				 }
			 }
			 str2=str2+a;	 
			 }	 
			 System.out.print(str2); 
			 sc.close();
	}
}
