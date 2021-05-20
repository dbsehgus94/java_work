package test;
import java.util.Scanner;
public class Test4_29 {
//5개의 정수로 구성된 그룹의 전체 합계(그룹별 합계 아닌 전체 그룹의 합)를 구하는 프로그램을 작성하시오.
//전체 10개의 그룹이 있으며 각 정수값은 키보드로 입력한다. 이 때, 99999를 입력하면 전체 입력 종료하고 
//88888을 입력하면 현재 읽고 있는 그룹의 입력을 종료하시오.
	public static void main(String[] args) {
		
/*		System.out.println("정수를 더합니다.");
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		for(i=1; i<=10; i++) {
			System.out.println(i+" 그룹");
			 
			for(j=1; j<=5; j++) {
				Scanner stdIn = new Scanner(System.in);
				System.out.print("정수: ");
				a = stdIn.nextInt();
				if (a == 88888) {
					break;
				}
				if (a == 99999) {
					i = 0;
					break;
				}
				
				b = b + a;
			}
			if (i==0) {
				break;
			}
			
		}
		System.out.println("");
		System.out.println("합계는 "+b+"입니다.");
		
	}
*/
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		int total = 0;
		
	Outer:
		for(int i=1; i<=10; i++) {
			System.out.println(i + " 그룹");
			
			for(int j=0;j<5;j++) {
				System.out.print("정수: ");
				int t = stdIn.nextInt();
				if (t == 99999) 
					break Outer;
				else if (t == 88888) 
					continue Outer;
					//break;
				total += t;
					
				
			}
		}
		System.out.println("sum: "+total);
	}
}
	
	
	

