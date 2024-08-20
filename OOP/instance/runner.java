class runner{
  public static void main(String[]args){
   Phone obj1= new Phone();
   Phone obj2= new Phone();
 
   obj1.price = 100;
   obj1.name = "Smartphone";
   obj1.brand = "Samsung";
   
   obj2.price = 170;
   obj2.name = "Smartphone";
   obj2.brand = "Apple";
  
   obj1.show();                // calling using an instance methode
   Phone.show1(obj2);         // calling using an static methode  
   
   
  }

}