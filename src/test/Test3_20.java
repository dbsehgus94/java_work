package test;
import java.util.Random;
import java.util.Scanner;
public class Test3_20 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int i = stdln.nextInt();
		String numberString = "";
		
		/*Random random = new Random();
		int a = random.nextInt(2);
		
		System.out.println(a);
		
		if (a == 0) {
			System.out.println("����");
		}
		
		else if (a == 1) {
			System.out.println("����");
			
		}
		
		else
			System.out.println("��");*/
		
		switch (i) {
			case 0: numberString = "����";
					break;
			case 1: numberString = "����";
					break;
			case 2: numberString = "��";
					break;
			default: numberString = "����";
					break;
		}
		System.out.println("���: "+numberString);
	}

}
