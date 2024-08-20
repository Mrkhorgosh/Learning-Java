public class House_design
{
  public static void main(String[]args)
  {
   House h1 = new House();
   House h2 =new House();
   
   h1.name="Cr7";
   h1.door=2;
   h1.window=4;
   h2.door=3;
   h2.window=7;
   h2.name="Messi";
   h2.increaseDoor(1);
   System.out.println(h2.name + ":" + h2.door +":"+ h2.window);
    
  }
}
class House
{
 String name;
 int door;
 int window;
 
 public void increaseDoor(int n)
 {
  door+=n;
 }
}