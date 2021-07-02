package test;
import java.util.Scanner;
import java.util.Arrays;
public class Test7_26 {
	static int[] insertArray(int[] a, int insidx, int insvalue) { //메서드 생성
		if(insidx<0 || insidx>a.length) { //insidx 값이 없다면
			return a.clone(); //a배열을 복제해서 반환한다.
		}
		else {
			int b[] = new int[a.length+1]; //배열 요소값 삽입을 위해 a배열보다 크기가 +1인 b 배열 생성
			int i = 0; //반복문 초기값 지정
			for (; i < insidx; i++) { //요소값 삽입 전 반복문
				b[i]=a[i]; //a배열 값을 그대로 b배열에 삽입한다.
			}
			for(; i<a.length;i++) { //요소값 삽입 후 뒤 배열을 위한 반복문
				b[i+1] = a[i]; //순서가 하나씩 뒤로 밀리기 때문에 b배열에는 a배열 순서에서 +1한 배열에 값을 삽입한다.
			}
			b[insidx]=insvalue;// 입력한 배열 위치와 요소값을 삽입힌다.
			
			return b; //b배열을 반환한다.
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int x = sc.nextInt(); //요소 수 입력
		int [] a = new int[x]; //배열 a 생성
		for(int i=0;i<a.length;i++) { //반복문을 사용하여 a배열의 요소값 입력
			System.out.print("a["+i+"] : ");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a)); //a 배열 출력
		System.out.print("삽입할 배열 : "); 
		int insidx = sc.nextInt(); //삽입할 배열 번호 입력
		System.out.print("삽입할 값 : "); 
		int insvalue = sc.nextInt(); //삽입할 요소 값 입력
		System.out.println(Arrays.toString(insertArray(a, insidx, insvalue))); //메서드 insertArray 출력
	}

}
/*
 * 배열 a의 요소 a[idx]에 x를 삽입해서 배열로 반환하는 insertArrayOf()를 작성하시오.
 * 삽입할 때는 a[idx] 뒤에 있는 모든 요소를 하나씩 뒤로 이동하시오.
 * 
 * 예) 배열 a의 요소가 {1, 3, 4, 7, 9, 11} 일 때, 2번째 인덱스에 99를 삽입할 경우,
 * 반환할 배열의 요소는 {1, 3, 99, 4, 7, 9, 11}이 됩니다. 
 * 
 */