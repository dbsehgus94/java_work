package test;
import java.util.Scanner;
public class Test4_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������: ");
		int a = stdIn.nextInt();
		int cnt = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
				cnt++;
				if (a==i) {
					System.out.println();
				}
			}
		}
		System.out.println("����� ����: "+ cnt);
		stdIn.close();
	}

}
