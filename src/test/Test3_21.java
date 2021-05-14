package test;
import java.util.Scanner;
public class Test3_21 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("월: ");
		int a = stdln.nextInt();
		String season = "";
		switch(a) {
			case 1 : season = "겨울";
					break;
			case 2 : season = "겨울";
					break;
			case 3 : season = "봄";
					break;
			case 4 : season = "봄";
					break;
			case 5 : season = "봄";
					break;
			case 6 : season = "여름";
					break;
			case 7 : season = "여름";	
					break;
			case 8 : season = "여름";
					break;
			case 9 : season = "가을";
					break;
			case 10 : season = "가을";
					break;
			case 11 : season = "가을";
					break;
			case 12 : season = "겨울";
					break;
			default : season = "그런 월은 없습니다.";
					break;
		}
		System.out.println("해당 월의 계절은: "+season);

	}

}
