package test;
import java.util.Random;
import java.util.Scanner;
public class Test3_20 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i = stdln.nextInt();
		String numberString = "";
		
		/*Random random = new Random();
		int a = random.nextInt(2);
		
		System.out.println(a);
		
		if (a == 0) {
			System.out.println("가위");
		}
		
		else if (a == 1) {
			System.out.println("바위");
			
		}
		
		else
			System.out.println("보");*/
		
		switch (i) {
			case 0: numberString = "가위";
					break;
			case 1: numberString = "바위";
					break;
			case 2: numberString = "보";
					break;
			default: numberString = "오류";
					break;
		}
		System.out.println("결과: "+numberString);
	}

}
