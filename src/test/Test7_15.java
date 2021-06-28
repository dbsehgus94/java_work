package test;
import java.util.Scanner;
public class Test7_15 {
	static int sumOf(int [] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int [] x = new int [num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("sum = " + sumOf(x));
		
	}

}
/*
 * 배열 a가 가진 모든 요소의 합을 구하는 sumOf() 메서드를 작성하시오.
 * 
 * 리턴타입 sumOf(매개변수){
 * 			return 리턴값;
 * }
 * 
 * <실행예>
 * 요소수 : 5
 * x[0] : 22
 * x[1] : 5
 * x[2] : 11
 * x[3] : 32
 * x[4] : 120
 * x = [22, 5, 11, 32, 120]
 * 모든 요소의 합은 : 190
 */