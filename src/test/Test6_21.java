package test;
import java.util.Scanner;
public class Test6_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학급 수: ");
		int row = sc.nextInt();
		int [][]c = new int[row][];
		int sum = 0;
		double avg = 0;
		int sum_total = 0;
		int student = 0;
		for(int i=0;i<c.length;i++) {
			System.out.print((i+1)+"반의 학생수: ");
			int column = sc.nextInt();
			c[i] = new int[column];
			
			for(column=0;column<c[i].length;column++) {
				System.out.print((i+1)+"반 "+(column+1)+"번의 점수: ");
				c[i][column] = sc.nextInt();
				
			}
			System.out.println();
		}
		
		System.out.println("반     |       합계     평균");
		System.out.println("--------------------------");
		for(int i=0;i<c.length;i++) {
			int [] c1 = c[i];
			for(int j=0;j<c1.length;j++) {
				sum += c1[j];
			}
			avg = (double)sum / (double)c1.length;
			System.out.print((i+1)+"반    |       ");
			System.out.print(sum+"    "   );
			System.out.printf("%.1f",avg);
			sum_total += sum;
			student += c1.length;
			sum = 0;
			System.out.println();
		}
		System.out.println("--------------------------");
		System.out.print("합     |       ");
		System.out.print(sum_total+"    ");
		System.out.printf("%.1f", (double)sum_total/(double)student);
	}
}
