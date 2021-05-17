package test;
import java.util.Scanner;
public class Test4_27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		int i = 0;
		
		System.out.print("몇개의 정수를 더할까요? : ");
		a = stdIn.nextInt();
		for(i=1;i<=a;i++) {
			System.out.print("정수 입력(종료:0) : ");
			b = stdIn.nextInt();
			sum = sum + b;
			if(b==0) {
				
				break;
			}
			
			if(sum>=1000) {
				sum = sum - b;
				System.out.println("합계가 1000을 넘었습니다.");
				System.out.println("마지막값은 무시합니다.");
				
				break;
			}
		}
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ (sum/a));
		
		stdIn.close();
	}

}
