package test;
import java.util.Scanner;
public class Test7_6 {
	public static String printSeason(int m) {
		/*String season;
		if(m>=3 && m<=5) {
			season = "��";
		}
		else if(m>=6 && m<=8) {
			season = "����";
		}
		else if(m>=9 && m<=11) {
			season = "����";
		}
		else if(m==12 || m==1 || m==2) {
			season = "�ܿ�";
		}
		else {
			season = "";
		}
		return season;
		*/
		
		String monthString = "";
		switch(m) {
		case 1: monthString = "�ܿ�";
				break;
		case 2: monthString = "�ܿ�";
				break;
		case 3: monthString = "��";
				break;
		case 4: monthString = "��";
				break;
		case 5: monthString = "��";
				break;
		case 6: monthString = "����";
				break;
		case 7: monthString = "����";
				break;
		case 8: monthString = "����";
				break;
		case 9: monthString = "����";
				break;
		case 10: monthString = "����";
				break;
		case 11: monthString = "����";
				break;
		case 12: monthString = "�ܿ�";
				break;
		
		}
		return monthString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��(��): ");
		int m;
		do {
			m=sc.nextInt();
		} while (m < 1|| m >12);
		
		System.out.println(printSeason(m));

	}
}


// �μ� m�� ������ ��(��)�� ������ ǥ���ϴ� printSeason �޼��带 �ۼ��Ͻÿ�.
// m���� ���� ��(3, 4, 5), ����(6, 7, 8), ����(9, 10, 11), �ܿ�(12, 1, 2)�� ǥ���ϰ�
// �� ���� ���� ���� �ƹ� �͵� ǥ������ �ʵ��� �ۼ��Ͻÿ�.
/*
 * �޼��� ����
 * static void printSeason(int m) {
 * 
 * }
 * 
 * 
 * �޼��� ȣ��
 * public static void main(String[] args){
 * 
 * }
 * 
 */