package test;
import java.util.Scanner;
public class Test6_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("<결과>");
		System.out.print("사람 수: ");
		int n = stdIn.nextInt();
		
		System.out.println("점수를 입력하세요.");
		
		int[] a = new int[n];
		int sum = 0;
		
		for (int i=0; i<a.length; i++) {
			System.out.print((i+1)+"번 점수: ");
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<n;i++) {
			
			if(max<a[i]) {
				max = a[i];
			}
			
			if(min>a[i]) {
				min = a[i];
			}
		}
		
		double avg = (double)(sum)/(double)(n);
		System.out.println("합계: "+ sum);
		System.out.println("평균: "+ avg);
		System.out.println("최고점: "+ max + "점");
		System.out.println("최저점: "+ min + "점");
		stdIn.close();
	}
	
}
