package test;
import java.util.Scanner;
public class Test5_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1: "+b1);
		b1 = stdIn.equals(b1);
		System.out.println("b2: "+b2);
		b1 = stdIn.equals(b2);
		 

	}

}
