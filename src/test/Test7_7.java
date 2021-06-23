package test;
import java.util.Scanner;
public class Test7_7 {
	public static void putChar(char c, int i) {
		for(int j=0;j<=i;j++) {
			System.out.print(c);
		}		
	}	
	public static void putStars(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 문자를 출력할까요? ");
		char ch = sc.next().charAt(0);
		for(int i=0;i<n;i++) {
			putChar(ch,i);
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수: ");
		int n = sc.nextInt();		
		putStars(n);	
	}
	/*
	public static void putChar(char c, int n) {
		while(n>0) {
			System.out.print(c);
			n--;
		}
	}
	public static void putDollars(int n) {
		putChar('$', n);
	}
	public static void putStars(int n, char chars) {
		putChar(chars, n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수: ");
		int n = sc.nextInt();
		System.out.print("문자: ");
		char c = sc.next().charAt(0);
		for(int i=1; i<n; i++) {
			putStars(i, c);
			System.out.println();
		}
		putStars(n);	
	}
	*/
}
//문자 c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해 
//문자 '*'을 n개 연속으로 표시하는 putStars 메서드를 작성하시오.
//이 메서드들을 사용해서 직각삼각형을 만드는 프로그램을 작성하시오.

//putChar()
//putStars()
//결과: 왼쪽 아래가 직각인 삼각형을 표시
//단수: 6
//*
//**
//***
//****
//*****
//******
/*
for(int i=0;i<a;i++) {
	for(int j=0;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
}
*/