package test;
import java.util.Scanner;
public class Test4_2 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("세자리 정수값 입력: ");
			num = stdln.nextInt();
		
		}while(num < 100 || num > 999); 
			
		System.out.println("입력한 3자리 양의 정수값: " + num);
		
	}

}
