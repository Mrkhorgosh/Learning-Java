package lab;
import java.util.Scanner;
public class Str_2 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 
	 for (int i = 0; i < s.length(); i++) {
         int count = 1;
         while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
             i++;
             count++;
         }
         System.out.print(s.charAt(i)+""+count);
     }
	 sc.close();
               	 
 }
}
