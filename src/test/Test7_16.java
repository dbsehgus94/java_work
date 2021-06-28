package test;
import java.util.Scanner;
public class Test7_16 {
	static int minOf1(int [] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	static int minOf2(int [] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수는 : ");
		int num = sc.nextInt();
		int [] x = new int [num];
		int [] y = new int [num];
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"번 신장 : ");
			x[i] = sc.nextInt();
			System.out.print((i+1)+"번 체중 : ");
			y[i] = sc.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람 신장 : " + minOf1(x));
		System.out.println("가장 마른 사람의 체중 : " + minOf2(y));
		
	}

}
/*배열 a의 요소 중에서 최소값을 구하는 minOf 메서드를 작성하시오.
(매개변수로 배열을 사용해서 풀이해 보세요)
가장 키가 작은 사람의 신장과 가장 마른 사람의 체중을 구하시오.

리턴타입 minOf(매개변수){

}

<실행 예>
사람 수는 : 4
4명의 신장과 체중을 입력
1번 신장 : 175
1번 체중 : 72
2번 신장 : 163
2번 체중 : 82
3번 신장 : 150
3번 체중 : 49
4번 신장 : 181
4번 체중 : 76
가장 키가 작은 사람 신장 : 150
가장 마란 사람의 체중 : 49
*/