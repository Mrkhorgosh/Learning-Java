package lab;

public class Lab_2_8 {
	public  static void main(String[]args){
		
		
		float a=8f;
		float b=3f;
		float d=a/2f;
		double h= Math.sqrt((d*d)+(b*b));
		
		double area= ((3*Math.sqrt(3)/2)*h*h);
		double circumference=h*6;
		
		System.out.printf("area:%f \n",area);
		System.out.printf("circumference: %f",circumference);
				
		
	}
	
	

}
