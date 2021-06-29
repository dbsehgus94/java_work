package test;
import java.util.Scanner;
public class Test7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int x = sc.nextInt();//배열의 개수를 정수형으로 입력
		int [] a = new int[x];//배열 a를 입력받은 x 개수로 선언
		for(int i=0;i<a.length;i++) {//앞서 선언한 배열의 공간에 값을 입력
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();//배열 인덱스 값 입력
		}
		System.out.print("삽입할 요소의 인덱스 : ");
		int insidx = sc.nextInt();//배열에 삽입할 인덱스 번호
		System.out.print("삽입할 요소의 인덱스 값 : ");
		int insvalue = sc.nextInt();//배열에 삽입할 인덱스 값
		
		if(insidx>=0 && insidx<a.length-1) { //값이 삽입된 인덱스부터 마지막 인덱스 전까지
			for(int i=a.length-1;i>insidx;i--) {
				a[i] = a[i-1];
			}
			a[insidx] = insvalue; //배열이 하나씩 밀려나므로 전 인덱스 값을 가져온다
		}
		for(int i=0;i<a.length;i++) {
		System.out.println("a["+i+"] : "+a[i]);
			
			
		}
	}

}
/*
 * 배열 a의 요소 a[idx]에 x를 삽입하는 insertArray() 메서드를 작성하시오.
 * 삽입 시에는 a[idx]~a.[a.length-2]를 하나씩 뒤로 이동시켜야 한다.
 * 
 * 예) 배열 a의 요소가 {1, 3, 4, 7, 9, 11} 일 때,
 * 인덱스 2에 99값을 입력하면 {1, 3, 99, 4, 7, 9}
 */

