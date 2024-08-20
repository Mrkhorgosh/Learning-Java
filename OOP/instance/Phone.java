public class Phone{
 int price;
 String brand;
 static String name;
 
 public void show(){
    System.out.println( brand + " : " + price + " : " + name);  // instance methode can use a static variable 
 }
 public static void show1(Phone obj){
    System.out.println( obj.brand + " : " + obj.price + " : " + name);  // Static methode cannot use instace variable directly. so we used obj reference to use instance variable
 }
}