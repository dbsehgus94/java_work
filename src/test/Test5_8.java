package test;

public class Test5_8 {

	public static void main(String[] args) {
		System.out.println("float      int");
		System.out.println("----------------------");
		 float x = 0.0F;
		 for(int i=0;i<=1000;i++) {
			 System.out.printf("%9.7       %9.7f\n", x, (float)i/1000);
			 x += 0.001F;
		 }
	}

}
