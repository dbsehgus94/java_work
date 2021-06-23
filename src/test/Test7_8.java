package test;
import java.util.Scanner;
import java.util.Random;
public class Test7_8 {
	static int random(int a, int b) {
		Random rand = new Random();
		if (b<=a) {
			b = a;
			return b;
		}
		else {
			int num1 = rand.nextInt(b-a+1)+a;
			return num1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하한값: ");
		int min = sc.nextInt();
		System.out.print("상한값: ");
		int max = sc.nextInt();
		
		int ret = random(min, max);
		System.out.print("생성한 난수는 "+ret);
		
		
	}
	/*
	public static void random(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하한값: ");
		a = sc.nextInt();
		System.out.print("상한값: ");
		b = sc.nextInt();
		
		Random rand = new Random();
		if (b<=a) {
			b = a;
			System.out.println("생성한 난수는"+b);
		}
		else {
			int num1 = rand.nextInt(b-a+1)+a;
			
			System.out.println("생성한 난수는"+num1);
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random(0, 0);
	}
	*/
	
	

}
//난수(a=<난수=<b)를 생성해서 반환하는 random 메서드를 작성하시오.
//메서드 안에서 난수를 생성하는 표준 라이브러리를 호출하시오.
//(참고, b<=a인 경우 a값을 그대로 반환할 것.)
//int random(int a, int b);