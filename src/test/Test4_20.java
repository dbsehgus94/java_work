package test;
import java.util.Scanner;
public class Test4_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int retry = 0;
		do {
			System.out.print("달(월)을 입력하세요: ");
			a = stdIn.nextInt();
			
			if (a>=3 && a<=5) {
				System.out.println("봄 입니다.");
			}
			
			else if (a>=6 && a<=8) {
				System.out.println("여름 입니다.");
			}
			
			else if (a>=9 && a<=11) {
				System.out.println("가을 입니다.");
			}
			
			else if (a==12 || a==1 || a==2) {
				System.out.println("겨울 입니다.");
			}
			
			if(a>=1 && a<=12) {
			System.out.print("다시 하시겠습니까?(yes: 1, no: 0) ");
			retry = stdIn.nextInt();
			}
			
		} while (a<=0 || a>=13 || retry == 1);
		
		stdIn.close();
	}
	
}
