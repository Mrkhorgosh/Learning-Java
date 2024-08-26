public class run {
public static void main(String []args)
 {
  //Calc obj= new Calc();
  //int r1=obj.add(3,4);
 // int r2=obj.sub(3,4);
  //System.out.println(r1+ " " +r2);
  
  //AdvCalc obj1= new AdvCalc();
  
  //double r3=obj1.div(3,1);
  //int r4 = obj1.multi(5,6);
  //System.out.println(r3+ " " +r4);
  //int r5=obj1.add(3,4);
  //int r6=obj1.sub(3,4);
  //System.out.println(r5+ " " +r6);
  
  VeryAdvCalc obj2= new VeryAdvCalc();
  
  double r8=obj2.div(3,1);
  int r7 = obj2.multi(5,6);
  System.out.println(r8+ " " +r7);
  int r9=obj2.add(24,4);
  int r10=obj2.sub(56,4);
  System.out.println(r9+ " " +r10);
  
  double r11=obj2.power(4,4);
  
  System.out.println((int)r11);
 }
}