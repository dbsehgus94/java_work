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
		System.out.println("3���� ���� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Test7_2 e = new Test7_2();
		System.out.println(e.min(a, b, c));

	}

}
// 3���� int�� �μ� a,b,c, �� �ּҰ��� ���ϴ� min �޼��带 �ۼ��Ͻÿ�.
