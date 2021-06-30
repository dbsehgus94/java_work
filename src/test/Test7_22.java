package test;
import java.util.Scanner;
public class Test7_22 {
	static int[] cloneArray(int[] a, int num1) {
		int [] b = new int[num1];
		for(int i=0; i<num1;i++) {
			b[i] = a[i];
		}
		return b;
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
		System.out.println("배열 a를 복사해서 배열 b를 생성");
		
		for(int i=0; i<num1;i++) {
			
			System.out.println("b["+i+"] : "+cloneArray(a, num1)[i]);
			
		}
		
	}

}
/* 배열 a와 같은 배열(요소 수가 같고 모든 요소의 값이 같은 배열)을 생성해서 반환하는 cloneArray 메서드를 작성하시오.
 * 예) 배열 a의 요소가 {1, 2, 3, 4, 5} => 배열 b의 요소가 {1, 2, 3, 4, 5}
 * 배열 a의 요소 수 : 5
 * a[0] : 11
 * a[1] : 22
 * a[2] : 33
 * a[3] : 44
 * a[4] : 55
 * 배열 a를 복사해서 배열 b를 생성
 * b[0] : 11
 * b[1] : 22
 * b[2] : 33
 * b[3] : 44
 * b[4] : 55
 * 
 */
