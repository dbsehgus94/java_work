package test;

import java.util.Scanner;
import java.util.Arrays;

public class Test7_23 {
	static int[] removeArray(int[] a, int del) { //메서드 생성
		int[] b = new int[a.length - 1]; //a배열보다 길이가 1 작은 b배열 생성
		for (int i = 0; i < a.length - 1; i++) { //for문 작성
			if (i >= del && i < a.length - 1) { //인덱스가 삭제되는 부분부터 마지막 배열까지
				a[i] = a[i + 1];
			}
			b[i] = a[i]; // 새로 만든 배열에 a 배열의 값을 옮긴다.
		}
		return b; // b 배열 반환
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : "); // 요소 수 입력
		int x = sc.nextInt();
		int[] a = new int[x]; // 배열 생성
		for (int i = 0; i < a.length; i++) { // a 배열 범위 지정
			System.out.print("a[" + i + "] : "); //a 배열 인덱스 값 입력
			a[i] = sc.nextInt(); //a 배열 인덱스 값 입력
		}
		System.out.println(Arrays.toString(a)); //a 배열 출력
		System.out.print("삭제할 배열 : "); //삭제할 배열 입력
		int del = sc.nextInt();
		System.out.println(Arrays.toString(removeArray(a, del))); //remove 메서드를 실행한 b 배열 출력
	}

}
/*
 * 배열 a에서 요소[idx]를 삭제한 배열을 반환하는 removeArray를 작성하시오. 삭제는 a[idx]보다 뒤에 있는 모든 요소를
 * 하나씩 앞으로 이동하시오. 
 * 예) 배열 a의 요소가 {1, 3, 4, 7, 9, 11} 일 때 인덱스 2를 삭제한다면, 반환되는 배열의
 * 요소는 {1, 3, 7, 9, 11} 입니다.
 * 
 * 
 */
