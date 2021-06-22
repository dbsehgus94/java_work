package test;
import java.util.Scanner;
public class Test7_6 {
	public static String printSeason(int m) {
		/*String season;
		if(m>=3 && m<=5) {
			season = "봄";
		}
		else if(m>=6 && m<=8) {
			season = "여름";
		}
		else if(m>=9 && m<=11) {
			season = "가을";
		}
		else if(m==12 || m==1 || m==2) {
			season = "겨울";
		}
		else {
			season = "";
		}
		return season;
		*/
		
		String monthString = "";
		switch(m) {
		case 1: monthString = "겨울";
				break;
		case 2: monthString = "겨울";
				break;
		case 3: monthString = "봄";
				break;
		case 4: monthString = "봄";
				break;
		case 5: monthString = "봄";
				break;
		case 6: monthString = "여름";
				break;
		case 7: monthString = "여름";
				break;
		case 8: monthString = "여름";
				break;
		case 9: monthString = "가을";
				break;
		case 10: monthString = "가을";
				break;
		case 11: monthString = "가을";
				break;
		case 12: monthString = "겨울";
				break;
		
		}
		return monthString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월): ");
		int m;
		do {
			m=sc.nextInt();
		} while (m < 1|| m >12);
		
		System.out.println(printSeason(m));

	}
}


// 인수 m에 지정한 달(월)의 계절을 표시하는 printSeason 메서드를 작성하시오.
// m값에 따라 봄(3, 4, 5), 여름(6, 7, 8), 가을(9, 10, 11), 겨울(12, 1, 2)를 표시하고
// 그 외의 값이 오면 아무 것도 표시하지 않도록 작성하시오.
/*
 * 메서드 선언
 * static void printSeason(int m) {
 * 
 * }
 * 
 * 
 * 메서드 호출
 * public static void main(String[] args){
 * 
 * }
 * 
 */