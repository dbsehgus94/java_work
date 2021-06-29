package test;
import java.util.Scanner;
public class Test7_17 {
	static int linearSearch(int [] a, int key) {
		int idxTop = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				idxTop = i;
				break;
			}
		}
		return idxTop;
	}
	
	static int linearSearchR(int [] a, int key) {
		int idxBtm = 0;
		for(int i=a.length-1; i>=0; i--) {
			if(a[i]==key) {
				idxBtm = i;
				break;
			}
		}
		return idxBtm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int x = sc.nextInt();
		int [] a = new int [x];
		
		for(int i=0; i<x; i++) {
			System.out.print("x["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("ã�� �� : ");
		int key = sc.nextInt();
		System.out.println("�ش� ���� ��Ұ� ���� �� �����մϴ�.");
		System.out.println("���� �տ� ��ġ�� ���� x["+linearSearch(a, key)+"]�� �ֽ��ϴ�.");
		System.out.println("���� �ڿ� ��ġ�� ���� x["+linearSearchR(a, key)+"]�� �ֽ��ϴ�.");
		
	}

}
/*
 * �迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž���ϴ� linearSearch �޼����
 * linearSearchR �޼��带 �ۼ��Ͻÿ�.
 * ��, Ű�� ���� ���� ������ ��Ұ� ���� ���� ���, linearSearch�� ���� �տ� ��ġ�� ��Ҹ� ã����,
 * linearSearch�� ���� �ڿ� ��ġ�� ��Ҹ� ã�� ��.
 * <���� ��>
 * ��� �� : 6
 * x[0] : 5
 * x[1] : 22
 * x[2] : 74
 * x[3] : 32
 * x[4] : 120
 * x[5] : 22
 * ã�� �� : 22
 * �ش� ���� ��Ұ� ������ �����մϴ�.
 * ���� �տ� ��ġ�� ���� x[1]�� �ֽ��ϴ�.
 * ���� �ڿ� ��ġ�� ���� x[5]�� �ֽ��ϴ�.
 */