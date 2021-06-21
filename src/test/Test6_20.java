//행에 따라 열의 개수가 다른 2차원 배열을 생성하시오.
//(행수, 열수, 각 요소의 값은 키보드로 입력 받음)
package test;
import java.util.Scanner;
public class Test6_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<결과>");
		System.out.println("불규칙한 2차원 배"
				+ "열을 생성");
		System.out.print("행 수 : ");
		int row = sc.nextInt();
		int [][] c = new int[row][];
		
		for (int i=0;i<c.length;i++) {
			System.out.print(i+"행의 열 수 : ");
			int column = sc.nextInt();
			c[i] = new int[column];
		
			System.out.println("각 요소의 값을 입력합니다.");
			for (column=0; column < c[i].length; column++) {
				System.out.print("c["+i+"]["+column+"] : ");
				c[i][column] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("배열 c의 각 요소 값을 출력");
		for(int i=0; i<c.length; i++) {
			int[] c1 = c[i];
			for(int j=0;j<c1.length;j++) {
				System.out.print(c1[j]+" ");
			}
			System.out.println();
		}
	}

}
