package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int select = 1;
		String a[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		String b[] = {"monday","tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		
		int rd = rand.nextInt(7);
		
		while(select == 1) {
			System.out.println("해당 요일의 영어 단어를 입력하시오.");
			System.out.println("소문자로 입력하세요.");
			System.out.print(a[rd]+": ");
			String day = stdIn.next();
			
			String temp = a[rd];
			a[rd] = day;
			
			if (a[rd].equals(b[rd])) {
				System.out.print("정답입니다. 다시 한번?(yes:1, no:0) ");
				select = stdIn.nextInt();
				if(select==1) {
					int rd1 = rand.nextInt(7);
					a[rd] = a[rd1];
					b[rd] = b[rd1];
					
				}
			}
			
			else {
				System.out.println("틀렸습니다.");
				a[rd] = temp;
				continue;
			}
			
		}
		
	}

}