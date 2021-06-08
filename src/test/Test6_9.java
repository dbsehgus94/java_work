package test;
import java.util.Scanner;
public class Test6_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("<결과>");
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();
		
		double[] a = new double[n];
		double sum = 0;
		
		for (int i =0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = stdIn.nextDouble();
			sum += a[i];
		}
		double avg = sum / n;
		
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
		
		stdIn.close();
	}

}
