import java.util.Scanner;
public class Meth_3{
  static double calcTax(int a,int s){
    double tax=0;
    if(a>=18){
      if(s<10000){
        tax=0;
        
      }    
      else if(s>=10000 && s<=20000){
         tax=(s*7)/100;
         
        }
      else if(s>20000){
         tax=(s*14)/100;
         
        }
      
    }
    return tax;
  
  }
  
  static double calcYearlyTax(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    double sum=0;
    for(int i=1;i<=12;i++){
      int s= sc.nextInt();
      double t=calcTax(a,s);
      System.out.printf("Month%d Tax: %f\n",i,t);
      sum+=t;
    }
    System.out.println("Total yearly Tax: "+sum);
    return sum;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   double t = calcTax(20,18000);
   System.out.println(t);
   calcYearlyTax();
   

  
  
  }



}