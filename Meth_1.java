public class Meth_1{
 
  static boolean isPrime(int n){
    boolean prime=true;
    for (int i=2;i<n;i++){
      
      if(n%i==0){
       prime=false;
      }  
    }
    
    return (prime); 
  }
  
   static boolean isPerfect(int n){
     boolean perfect=false;
     int sum=0;
     for(int i=1;i<n;i++){
       if(n%i==0){
         sum+=i;
       }
     }
     if(sum==n)
       perfect=true;
     return perfect;
   }
   
   static int special_sum(int n){
     int sum=0;
     for(int i=2;i<n;i++){
       if(isPrime(i)==true || isPerfect(i)==true){
         sum+=i;
       }
     }
     return sum; 
   }
    
  public static void main(String[]args){
   boolean check=isPrime(15);
   System.out.println(check);
   boolean check2 = isPerfect(33);
   System.out.println(check2);
   int result = special_sum(8);
   System.out.println(result);

  
  }


}