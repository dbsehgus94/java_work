package test;
import java.util.Scanner;

public class Test4_1 {

	public static void main(String[] args) {
		
		
	while(true) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("정수값을 입력하세요: ");
		int num1 = stdln.nextInt();
	
		if (num1>0) {
			System.out.println("이 값은 양수입니다.");
			
			System.out.println("다시 한번 입력하시겠습니까? Yes:1, No:1을 제외한 정수");
			int retry = stdln.nextInt();
			if (retry == 1) {
				
				continue;
			}
			
			else 
				break;
		}
		
		else if (num1<0) {
			System.out.println("이 값은 음수입니다.");
			
			System.out.println("다시 한번 입력하시겠습니까? Yes:1, No:1을 제외한 정수");
			int retry = stdln.nextInt();
			if (retry == 1) {
				continue;
			}
		
			else 
				break;
		
		

	}

}
}
} // do - while문도 작성