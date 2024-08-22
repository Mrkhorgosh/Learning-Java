public class Encapsulation
{
  public static void main(String[]args)
  {
   Human obj = new Human();
   
   
   // obj.age=12;                     wont work because the instance variables are private
  // System.out.println("name");
   
  System.out.println( obj.getName() + ":"+ obj.getAge()); // before setting values 
   
  obj.setAge(22);
  obj.setName("hazen");
  
  System.out.println( obj.getName() + ":"+ obj.getAge());
   
  }
}

class Human
{
 private int age;
 private String name;
 
 public Human()    //this is called constructor
 {
  age=16;        // Used to change default values from 0 and null to anything we like
  name="NPC";    // constructor gets called when object is created
 
 }
 
 public void setAge(int age)    //setters
 {
  this.age= age;   // this refers that it is the instance var
 }
 
 public int getAge()    //getters
 {
  return age;
 }
  public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name=name;
 }
}