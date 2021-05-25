package test;
import java.util.Scanner;
import java.util.Random;
public class Test4_30 {

	public static void main(String[] args) {
		System.out.println("숫자 맟주기 게임 시작!");
		System.out.println("0부터 99까지 숫자를 맞추세요.");
		Random rand = new Random();
		int a = 0;
		int i = 0;
		int b = 0;
		
		
		
		for(i=1;i<=7;i++) {
			System.out.print("남은 횟수 "+(7-i)+"회, 어떤 숫자일까요?");
			Scanner stdIn = new Scanner(System.in);
			a = stdIn.nextInt();
			
		}

	}

}
