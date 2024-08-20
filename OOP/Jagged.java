package oop;

public class Jagged {
 public static void main(String[]args) {
	 
	int num[][] = new int[3][];  //creating an array without column mentioned
	
	num[0]= new int [4];   // defining each rows column number
	num[1]= new int [3];
	num[2]= new int [2];
			
	for(int i=0;i<num.length;i++) {              // putting value and printing 
		 
		for(int j=0;j<num[i].length;j++) {
			num[i][j]=(int)(Math.random()*10);
			System.out.print(num[i][j]+" ");
			
		}
		
		System.out.println();
	}
	int num2[][][]= new int [3][4][6]; // 3d array	
	
 }
}



