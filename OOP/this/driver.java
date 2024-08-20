public class driver
{
  public static void main(String[]args){
    Dog d1= new Dog();
    d1.name="wolly";
    d1.breed="golden retriver";
   
    Dog d2= new Dog(); 
    d2.name="wolvy";
    d2.breed="german shepard";
    
    d1.command("siting");
    System.out.println( d1.breed +" " + d1.name + " is " + d1.action );
    System.out.println("=========================");
    d2.command("running");
    System.out.println( d2.breed +" " + d2.name + " is " + d2.action );
    
  }
}