package test;
import java.util.Scanner;
import java.util.Random;

public class Test7_10 {
	
	public static void main(String[] args) {
		System.out.println();
	}
}

//���� 4���� ��� ���� �� �ϳ��� �������� �����ϴ� �ϻ� �Ʒ� ���α׷��� �ۼ��Ͻÿ�.
//(�̶� x,y,z,�� 3�ڸ��� �������� ������ ������ ��)
// x+y+z / x+y-z / x-y+z / x-y-z
//<���>
//�ϻ� �Ʒ�!
//341+616-742 = 215
//Ʋ�Ƚ��ϴ�!
//341+616-742 = 216
//�����Դϴ�.
//�ٽ��ѹ�?<yes:1, no:0>: 1
/*
 * public static void main(String[] args) {
 * 		Random rand = new Random();
 *		int retry = 0;
 *		do {
 *				int x = rand.nextInt(900)+100;   100~999 
 *				int y = rand.nextInt(900)+100;
 *				int z = rand.nextInt(900)+100;
 *				int pattern = rand.nextInt(4);   0~3
 *				int answer;
 *				int input;
 *
 *				switch(pattern) {
 *							case 0: answer = x + y + z;		break;
 *							case 1: answer = x + y - z;		break;
 *							case 2: answer = x - y + z;		break;
 *							default: answer = x - y - z;	break;
 *				}
 *				while(true) {
 *		
 *							System.out.print(
 *										x + ((pattern<2)?"+" : "-") +
 *										y + ((pattern%2==0)?"+":"-") + 
 *										z + "=");
 *							);
 *
 *							input = sc.nextInt();
 *							if (input == answer)
 *										print("�����Դϴ�!");
 *										do {
 *												print("�ٽ��ѹ�?<yes:1, no:0>: ");
 *												retry = sc.nextInt();
 *										}while (retry!=0 && retry !=1); 
 *
 *										break;
 *								
 *							else
 *								System.out.println("�����Դϴ�!")
 * 
 * 
 * 
 * 
 * Scanner sc = new Scanner(System.in);
		System.out.println("<���>");
		System.out.println("�ϻ� �Ʒ�!");
		do {
			int ques = 0;
			calculator();
			int b = sc.nextInt();
			if (b != ques) {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
			else {
				System.out.println("�����Դϴ�!");
			}
			
		} while (confirmRetry());
 * 
 * 
 * static void calculator() {
		Random rand = new Random();
		
		int x = rand.nextInt(1000-100)+100;
		int y = rand.nextInt(1000-100)+100;
		int z = rand.nextInt(1000-100)+100;
		
		int a[] = {x+y+z, x+y-z, x-y+z, x-y-z};
		int num = rand.nextInt(4);
		int ques = a[num];
		
		if (ques==a[0]) {
			System.out.print(x+"+"+y+"+"+z+"= ");
		}
		if (ques==a[1]) {
			System.out.print(x+"+"+y+"-"+z+"= ");
		}
		if (ques==a[2]) {
			System.out.print(x+"-"+y+"+"+z+"= ");
		}
		if (ques==a[3]) {
			System.out.print(x+"-"+y+"-"+z+"= ");
		}
	}
	static boolean confirmRetry() {
		Scanner sc = new Scanner(System.in);
		int retry;
		do {
			System.out.print("�ٽ� �ѹ�?(1:yes, 0:no) ");
			retry = sc.nextInt();
		} while (retry != 0 && retry != 1);
		
		return retry ==1;
	}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 *
 **/
