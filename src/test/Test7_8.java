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
		
		System.out.print("���Ѱ�: ");
		int min = sc.nextInt();
		System.out.print("���Ѱ�: ");
		int max = sc.nextInt();
		
		int ret = random(min, max);
		System.out.print("������ ������ "+ret);
		
		
	}
	/*
	public static void random(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ѱ�: ");
		a = sc.nextInt();
		System.out.print("���Ѱ�: ");
		b = sc.nextInt();
		
		Random rand = new Random();
		if (b<=a) {
			b = a;
			System.out.println("������ ������"+b);
		}
		else {
			int num1 = rand.nextInt(b-a+1)+a;
			
			System.out.println("������ ������"+num1);
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random(0, 0);
	}
	*/
	
	

}
//����(a=<����=<b)�� �����ؼ� ��ȯ�ϴ� random �޼��带 �ۼ��Ͻÿ�.
//�޼��� �ȿ��� ������ �����ϴ� ǥ�� ���̺귯���� ȣ���Ͻÿ�.
//(����, b<=a�� ��� a���� �״�� ��ȯ�� ��.)
//int random(int a, int b);