package test;
import java.util.Scanner;
public class Test7_21 {
	static void exchangeArray(int[] a, int[] b) {
		int n = 0;
		if(a.length<b.length) {
			n = a.length;
		}
		else {
			n = b.length;
		}
			
		for(int i=0; i<n;i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소 수 : ");
		int num1 = sc.nextInt();
		int [] a = new int [num1];
		for(int i=0; i<a.length;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("배열 b의 요소 수 : ");
		int num2 = sc.nextInt();
		int [] b = new int [num2];
		for(int i=0; i<b.length;i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		exchangeArray(a, b);
		System.out.println("배열 a와 b의 전체 요소를 교환");
		int temp = 0;
		for(int i=0; i<num1; i++) {
			System.out.println("a["+i+"] : "+a[i]);
		}
		for(int i=0; i<num2; i++) {
			System.out.println("b["+i+"] : "+b[i]);
		}
			
	}

}
/*
 * 배열 a와 배열 b의 전체 요소값을 교환하는 exchangeArray 메서드를 작성하시오.
 * 두 배열의 요소 수가 같지 않다면 작은 쪽의 배열 수에 맞추어 교환하시오.
 * 예) 배열 a의 요소가 {1, 2, 3, 4, 5, 6, 7}이고 배열 b의 요소가{5, 4, 3, 2, 1} 일 때,
 * 배열 a{5, 4, 3, 2, 1, 6, 7}이 되고 배열 b는 {1, 2, 3, 4, 5}가 됩니다.
 * 
 *  <실행 예>
 *  배열 a의 요소 수 : 7
 *  a[0] : 1
 *  a[1] : 2
 *  a[2] : 3
 *  a[3] : 4
 *  a[4] : 5
 *  a[5] : 6
 *  a[6] : 7
 *  배열 b의 요소 수 : 5
 *  b[0] : 5
 *  b[1] : 4
 *  b[2] : 3
 *  b[3] : 2
 *  b[4] : 1
 *  배열 a와 b의 전체 요소를 교환
 *  a[0] : 5
 *  a[1] : 4
 *  a[2] : 3
 *  a[3] : 2
 *  a[4] : 1
 *  a[5] : 6
 *  a[6] : 7
 *  b[0] : 1
 *  b[1] : 2
 *  b[2] : 3
 *  b[3] : 4
 *  b[4] : 5
 */