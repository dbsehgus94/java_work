package test;
import java.util.Scanner;
public class Test7_18 {
	static void aryRmv(int [] a, int delidx) {
		for(int i=0;i<a.length;i++) {
			if(i>=delidx && i<a.length-1) { //값이 삭제된 인덱스부터 마지막 인덱스 전까지
				a[i] = a[i+1]; //다음 인덱스 값을 가져온다
			}
			else if(i==a.length-1) { //마지막 인덱스일때
				
				a[a.length-1]=a[a.length-2]; //마지막 인덱스와 그 앞의 인덱스 값을 같은 숫자로 출력하게 한다.
				
			}
			System.out.println("a["+i+"] : "+a[i]);
			
			
		}
	}
	
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
		
		System.out.print("삭제할 요소의 인덱스 : ");
		int delidx = sc.nextInt();//삭제할 인덱스 값
		aryRmv(a, delidx);//메서드 실행
		
	}

}
/*	
static int[] aryRmv(int [] a, int delidx) {
	int [] num = null;
	for(int i=0;i<a.length;i++) {
		if(i>=delidx && i<a.length-1) {
			a[i] = a[i+1];
		}
		else if(i==a.length-1) {
			
			a[a.length-1]=a[a.length-2];
			
		}
		num = new int[a[i]];
		
		
	}
	return num;
	
}
*/
/*
 * 배열 a로부터 요소 a[idx]를 삭제하는 aryRmv 메서드를 작성하시오.
 * a[idx]의 삭제 후, 그 뒤에 있는 요소들을 앞으로 하나씩 이동하시오.
 * 이동 후에 비게 되는 마지막 요소 a[a.length-1]의 값은 이동하기 전의 마지막 값을 유지하시오.
 * 
 * 예) 배열 a의 요소가 {1, 3, 4, 7, 9, 11} 일 때,
 * 3값을 삭제하면 {1, 3, 7, 9, 11, 11}
 * 2값을 삭제하면 {1, 4, 7, 9, 11, 11}
 * 
 * 
 */