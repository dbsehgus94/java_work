package test;
import java.util.Scanner;
public class Test3_21 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("��: ");
		int a = stdln.nextInt();
		String season = "";
		switch(a) {
			case 1 : season = "�ܿ�";
					break;
			case 2 : season = "�ܿ�";
					break;
			case 3 : season = "��";
					break;
			case 4 : season = "��";
					break;
			case 5 : season = "��";
					break;
			case 6 : season = "����";
					break;
			case 7 : season = "����";	
					break;
			case 8 : season = "����";
					break;
			case 9 : season = "����";
					break;
			case 10 : season = "����";
					break;
			case 11 : season = "����";
					break;
			case 12 : season = "�ܿ�";
					break;
			default : season = "�׷� ���� �����ϴ�.";
					break;
		}
		System.out.println("�ش� ���� ������: "+season);

	}

}
