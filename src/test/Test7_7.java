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
		System.out.print("� ���ڸ� ����ұ��? ");
		char ch = sc.next().charAt(0);
		for(int i=0;i<n;i++) {
			putChar(ch,i);
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ�: ");
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
		System.out.print("�ܼ�: ");
		int n = sc.nextInt();
		System.out.print("����: ");
		char c = sc.next().charAt(0);
		for(int i=1; i<n; i++) {
			putStars(i, c);
			System.out.println();
		}
		putStars(n);	
	}
	*/
}
//���� c�� n�� ǥ���ϴ� putChar �޼���� �� �޼��带 ���ο��� ȣ���� 
//���� '*'�� n�� �������� ǥ���ϴ� putStars �޼��带 �ۼ��Ͻÿ�.
//�� �޼������ ����ؼ� �����ﰢ���� ����� ���α׷��� �ۼ��Ͻÿ�.

//putChar()
//putStars()
//���: ���� �Ʒ��� ������ �ﰢ���� ǥ��
//�ܼ�: 6
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