package test;
import java.util.Scanner;
public class Test7_15 {
	static int sumOf(int [] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		int [] x = new int [num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("sum = " + sumOf(x));
		
	}

}
/*
 * �迭 a�� ���� ��� ����� ���� ���ϴ� sumOf() �޼��带 �ۼ��Ͻÿ�.
 * 
 * ����Ÿ�� sumOf(�Ű�����){
 * 			return ���ϰ�;
 * }
 * 
 * <���࿹>
 * ��Ҽ� : 5
 * x[0] : 22
 * x[1] : 5
 * x[2] : 11
 * x[3] : 32
 * x[4] : 120
 * x = [22, 5, 11, 32, 120]
 * ��� ����� ���� : 190
 */