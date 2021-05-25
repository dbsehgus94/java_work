package test;

public class Test5_9 {

	public static void main(String[] args) {
		System.out.println("   x          xÀÇ Á¦°ö");
		System.out.println("----------------------");
		float x = 0.0F;
		for(float i=0;i<=1000;i++) {
			System.out.printf("%9.3f     %9.7f\n", x, x*x);
			x += 0.001F; 
		 }
		 
		System.out.println("   a          aÀÇ Á¦°ö");
		System.out.println("----------------------");
		float a = 0.0F;
		for(int i=0;i<=1000;i++) {
			System.out.printf("%9.3f     %9.7f\n", a, (float)(a*a));
			a += 0.001F;
				 
		}
	}

}
