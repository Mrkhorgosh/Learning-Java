class Student{
 
 int roll;           //creating a student class
 String name;
 int num;
 
}

public class ArrayOfObject {
 public static void main(String[]args) {
  
  Student s1= new Student();    //creating student objects and assigning values
  s1.roll=1;
  s1.name="Fab"; 
  s1.num=99;
  
  Student s2= new Student();
  s2.roll=2;
  s2.name="alibaba";
  s2.num=12;
  
  Student s3= new Student();
  s3.roll=3;
  s3.name="aladin";
  s3.num=10;
  
  
  Student stu[]=new Student[3];   //creating an [student class] type array
  
  stu[0]=s1;
  stu[1]=s2;
  stu[2]=s3;
   for(Student n : stu) {                                     // Enhanced for loop : works for arrays without initiation or increment.  
    
    System.out.println(n.name + n.roll + " : " + n.num);  //printing the values   
   }
  
  
  
 }
}