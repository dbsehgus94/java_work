package test;
import java.util.Scanner;
public class Test7_31 {
	static int absolute(int x) { //���� �޼��� absolute ����
		if(x<0) { //x���� 0���� �۴ٸ�
			x = x*-1; //x�� -1�� ���Ѵ�.
			return x; //x�� ��ȯ�Ѵ�.
		}
		return x; //if���ǿ� �ش����� �ʴ´ٸ� x�� ��ȯ�Ѵ�.
	}
	static long absolute(long x) { //���� �޼��� absolute ����
		if(x<0) { //x���� 0���� �۴ٸ�
			x = x*-1; //x�� -1�� ���Ѵ�.
			return x; //x�� ��ȯ�Ѵ�.
		}
		return x; //if���ǿ� �ش����� �ʴ´ٸ� x�� ��ȯ�Ѵ�.
	}
	static float absolute(float x) { //���� �޼��� absolute ����
		if(x<0) { //x���� 0���� �۴ٸ�
			x = x*-1; //x�� -1�� ���Ѵ�.
			return x; //x�� ��ȯ�Ѵ�.
		}
		return x; //if���ǿ� �ش����� �ʴ´ٸ� x�� ��ȯ�Ѵ�.
	}
	static double absolute(double x) { //���� �޼��� absolute ����
		if(x<0) { //x���� 0���� �۴ٸ�
			x = x*-1; //x�� -1�� ���Ѵ�
			return x; //x�� ��ȯ�Ѵ�.
		}
		return x; //if���ǿ� �ش����� �ʴ´ٸ� x�� ��ȯ�Ѵ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("int �� ���� a�� �� : ");
		int a = sc.nextInt(); //int a �Է�
		System.out.print("long �� ���� b�� �� : ");
		long b = sc.nextLong(); //long b �Է�
		System.out.print("float �� ���� c�� �� : ");
		float c = sc.nextFloat(); //float c �Է�
		System.out.print("double �� ���� d�� �� : ");
		double d = sc.nextDouble(); //double d �Է�
		
		System.out.println("a�� ���밪 : "+absolute(a)); //int a�� ���밪 ���
		System.out.println("b�� ���밪 : "+absolute(b)); //long b�� ���밪 ���
		System.out.println("c�� ���밪 : "+absolute(c)); //float c�� ���밪 ���
		System.out.println("d�� ���밪 : "+absolute(d)); //double d�� ���밪 ���
		
	}

}
/*
 * int �� ���� x�� ���밪, long�� ���� x�� ���밪, float�� ���� x�� ���밪, double�� ���� x�� ���밪�� ���ϴ� ���� �޼��带 �ۼ�����.
 * absolute()
 */