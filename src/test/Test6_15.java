package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int select = 1;
		String a[] = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		String b[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int rd = rand.nextInt(12);
		int rd1 = rand.nextInt(12);
		
		while(select == 1) {
			System.out.println("첫글자는 대문자, 나머지는 소문자로 입력하세요.");
			System.out.print(a[rd]+": ");
			String month = stdIn.next();
			
			String temp = a[rd];
			a[rd] = month;
			
			
			if (a[rd].equals(b[rd])) {
				System.out.println("정답입니다. 다시 한번?(yes:1, no:0)" );
				select = stdIn.nextInt();
				if(select==1) {
					a[rd] = a[rd1];
					continue;
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
