package test;
import java.util.Scanner;
public class Test7_2 {
	public int min(int a, int b, int c) {
		int min =a;
		if(min>b) {
			min = b;
			if(min>c) {
				min=c;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Test7_2 e = new Test7_2();
		System.out.println(e.min(a, b, c));

	}

}
// 3개의 int형 인수 a,b,c, 중 최소값을 구하는 min 메서드를 작성하시오.
