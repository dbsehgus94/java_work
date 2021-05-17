package test;
import java.util.Scanner;
public class Test4_28 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		int i = 0;
		int c = 0;
		System.out.print("몇개를 더할까요? : ");
		a = stdIn.nextInt();
		
		for(i=1;i<=a;i++) {
			System.out.print("정수 입력: ");
			b = stdIn.nextInt();
			if (b < 0) {
				System.out.println("음수는 더하지 않습니다.");
				c += 1;
				continue;
			}
			sum += b;
		}
		
		System.out.println("합계가 "+sum);
		if (c>=1) {
			System.out.println("평균은 "+(sum/(a-c)));
		}
		else
			System.out.println("평균은 "+(sum/a));
		
	}

}
