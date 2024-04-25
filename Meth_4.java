import java.util.Scanner;
public class Meth_4{
static void oneToN(int n) {
  if(n==0){
     return ;
  } 
  else if(n>0){
    oneToN(n-1);
    System.out.print(n+" ");
  }
  return;
  }

public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  oneToN(n);
 }
}