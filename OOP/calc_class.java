package oop;


class MyCalculator{
	  int a;
	  public int add(int n1,int n2){
	   int result=n1+n2;
	   return result;
	  
	  }
	}

	public class calc_class{
	  public static void main(String[]args){
	   
	    MyCalculator calc =new MyCalculator();
	    int result =calc.add(4,5);
	    System.out.println(result);
	  
	  }


	}