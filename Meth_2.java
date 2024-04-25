public class Meth_2{
  static String showDots(int n){
   String a="";
   for(int i=1;i<=n;i++){
    a+=".";
   }
   return a;
  }
  static void palindrome(int n){
    for(int i=1;i<n;i++){
     System.out.print(i);
    }
    for(int i=n;i>=1;i--){
     System.out.print(i);
    }
  }
  static void showDiamond(int n){
  for(int i=1;i<=n;i++) {
  for(int j=1;j<=n-i;j++) {
   System.out.print(".");
  }
  for(int d=1;d<=(2*i-1);d++) {
   System.out.print(d);
  }
  for(int j=1;j<=n-i;j++) {
   System.out.print(".");
  }
  System.out.println();
  }
 for(int i=n-1;i>=1;i--) {
  for(int j=1;j<=n-i;j++) {
   System.out.print(".");
  }
  for(int d=1;d<=(2*i-1);d++) {
   System.out.print(d);
  }
  for(int j=1;j<=n-i;j++) {
   System.out.print(".");
  }
  System.out.println();
  }
 }
  
  public static void main(String[]args){
   System.out.println(showDots(5));
   palindrome(5);
   System.out.println();
   showDiamond(5);
  }
}