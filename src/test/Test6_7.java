package test;
import java.util.Scanner;
public class Test6_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("<���>");
		System.out.print("��� ��: ");
		int n = stdIn.nextInt();
		
		System.out.println("������ �Է��ϼ���.");
		
		int[] a = new int[n];
		int sum = 0;
		
		for (int i=0; i<a.length; i++) {
			System.out.print((i+1)+"�� ����: ");
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<n;i++) {
			
			if(max<a[i]) {
				max = a[i];
			}
			
			if(min>a[i]) {
				min = a[i];
			}
		}
		
		double avg = (double)(sum)/(double)(n);
		System.out.println("�հ�: "+ sum);
		System.out.println("���: "+ avg);
		System.out.println("�ְ���: "+ max + "��");
		System.out.println("������: "+ min + "��");
		stdIn.close();
	}
	
}
