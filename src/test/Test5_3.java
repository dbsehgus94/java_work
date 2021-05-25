package test;
import java.util.Scanner;
public class Test5_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("float형 변수 x: ");
		float x = stdIn.nextFloat();
		
		System.out.print("double형 변수 y: ");
		double y = stdIn.nextDouble();
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		stdIn.close();
	}

}
