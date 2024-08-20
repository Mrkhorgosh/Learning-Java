package oop;

public class multidim_array {
  public static void main(String[]args) {
	 
	  //Creating and printing an 2d array
	  
	  int num[][]= new int [3][4];
	  
	  for(int i=0;i<3;i++) {
		  
		  for(int j=0;j<4;j++) {
			 
			  System.out.print(num [i][j] + " ");		  
			  
			  
		  }
		  System.out.println();
		  
	  }
	  System.out.println();
	  
	  // changing the values randomly and printing it
       
	  for(int i=0;i<3;i++) {
		  
		  for(int j=0;j<4;j++) {
			 
			  num[i][j]= (int)(Math.random()	*10) ;
			  System.out.print(num [i][j] + " ");	
			  
		  }
		  System.out.println();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
	
	
}
