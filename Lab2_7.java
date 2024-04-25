package lab;

public class Lab2_7 {
	
	public static void main (String[]args) {
		float h=5f+(56f/60f)+(23f/3600f);
		float dkm=1658/1000f;
		float dmiles=1658f/1609f;
		
		float v1=dkm/h;
		float v2=dmiles/h;
		
		System.out.printf("Your velocity in km/h is %f\n",v1);
		System.out.printf("Your velocity in miles/h is %f\n",v2);
		

		
		
		
	}

}
