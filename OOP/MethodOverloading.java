
public class MethodOverloading{
 public static void main(String[]args)
  {
    Calculator obj = new Calculator();
    
    System.out.println(obj.add(2,4));
    System.out.println(obj.add(2,6,3));
    System.out.println(obj.add(2.6,4));

  }
}

class Calculator
{
  public int add(int n1, int n2)
  {
   return n1+n2;
  }
  public int add(int n1, int n2,int n3)
  {
   return n1+n2+n3;
  }
  public double add(double n1, double n2)
  {
   return n1+n2;
  }
}