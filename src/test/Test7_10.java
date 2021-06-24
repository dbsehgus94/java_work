package test;
import java.util.Scanner;
import java.util.Random;

public class Test7_10 {
	
	public static void main(String[] args) {
		System.out.println();
	}
}

//다음 4개의 계산 문제 중 하나를 무작위로 출제하는 암산 훈련 프로그램을 작성하시오.
//(이때 x,y,z,에 3자리의 정수값을 난수로 생성할 것)
// x+y+z / x+y-z / x-y+z / x-y-z
//<결과>
//암산 훈련!
//341+616-742 = 215
//틀렸습니다!
//341+616-742 = 216
//정답입니다.
//다시한번?<yes:1, no:0>: 1
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
 *										print("정답입니다!");
 *										do {
 *												print("다시한번?<yes:1, no:0>: ");
 *												retry = sc.nextInt();
 *										}while (retry!=0 && retry !=1); 
 *
 *										break;
 *								
 *							else
 *								System.out.println("오답입니다!")
 * 
 * 
 * 
 * 
 * Scanner sc = new Scanner(System.in);
		System.out.println("<결과>");
		System.out.println("암산 훈련!");
		do {
			int ques = 0;
			calculator();
			int b = sc.nextInt();
			if (b != ques) {
				System.out.println("틀렸습니다!");
			}
			else {
				System.out.println("정답입니다!");
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
			System.out.print("다시 한번?(1:yes, 0:no) ");
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
