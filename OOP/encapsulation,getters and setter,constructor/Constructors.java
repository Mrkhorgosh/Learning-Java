public class Constructors
{
  public static void main(String[]args)
  {
   Human obj = new Human(16,"rob");
   Human obj1 = new Human();
   Human obj2 = new Human("jon");
   System.out.println( obj.getName() + ":"+ obj.getAge());
   System.out.println( obj1.getName() + ":"+ obj1.getAge());
   System.out.println( obj2.getName() + ":"+ obj2.getAge());
  }
}

class Human
{
 private int age;
 private String name;
 
 public Human()    // default constructor
 {
  age=16;        
  name="NPC";    
 } 
 public Human(String name) {
  //this.age=age;
  this.name=name;
 }
 
 
 public Human(int age,String name) //Parameterized constructor
 {
  this.age=age;
  this.name=name;
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