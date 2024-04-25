package lab;

import java.util.Scanner;

public class Str_6 {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		 String str1=sc.nextLine();
		 
		 boolean upper=false;
		 boolean lower= false;
		 boolean digit=false;
		 boolean sp=false;
		 
		 for(int i=0;i<str1.length();i++) {
			 if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
				 upper=true;
			  else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
				 lower=true;
			  else if(str1.charAt(i)>='0'&&str1.charAt(i)<='9')
				  digit=true;
			  else 
				  sp=true;
			 
		 }
		 if(upper==true && lower==true && digit==true && sp==true) 
			 System.out.print("true");
		 else
			 System.out.print("false");
		 
		sc.close();	 
		 
}
}
