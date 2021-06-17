package test;
import java.util.Scanner;
public class Test6_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int [][] a = new int[6][2];
		//String [][] b = new String[6][2];
		//int [][] c = new int [6][1];
		
		final int number = 6;
		int[][] score = new int [6][2];
		int[] sumStudent = new int [number];
		int[] sumSubject = new int [2];
		
		System.out.printf("%d명의 국어, 수학 점수를 입력 \n", number);
			
		for(int i=0;i<number;i++){
			System.out.printf("%2d번 국어 : ", i+1);
			score[i][0] = stdIn.nextInt(); //국어
			System.out.printf("    수학 : ");
			score[i][1] = stdIn.nextInt(); //수학
			
			sumStudent[i] = score[i][0] + score[i][1];
			sumSubject[0] += score[i][0];
			sumSubject[1] += score[i][1];
		}
		System.out.println("No.   국어   수학   평균");
		for(int i=0; i<6; i++) {
			System.out.printf("%2d%6d%6d%7.1f\n", i+1, score[i][0], score[i][1], (double)sumStudent[i]/2);
		}
		System.out.printf("평균%7.1f%6.1f\n", (double)sumSubject[0]/6, (double)sumSubject[1]/6);
		}
}
/*		
		for(int i=0;i<6;i++){
			for(int j=0;j<1;j++){
			  	System.out.print((i+1)+"번 국어 : ");
					a[i][j] = stdIn.nextInt();
				System.out.print((i+1)+"번 수학 : ");
					a[i][j+1] = stdIn.nextInt();
			}
		}
		
		for(int i=0;i<6;i++) {
			c[i][0] = i+1;
		}
		
		
		
	}
	
}

*/
/*
 * for (int i=0;i<6;i++) {
 * 		a[i][0] = stdIn.nextInt();
 * 		a[i][1] = stdIn.nextInt();
 * 		}
 * 
 * 
 * 		for(int i=0;i<6;i++) {
			for(int j=0;j<3;j++) {
				if (j==0) {
					a[i][j] = i+1;
					//System.out.println(a[i][j]);
					continue;
				}
				
				
				
				
				}
			}
		}
	}
*/
/*
		a[0][0] = "No.";
		System.out.print(a[0][0]);
		a[0][1] = "국어";
		System.out.print(a[0][1]);
		a[0][2] = "수학";
		System.out.print(a[0][2]);
		a[0][3] = "평균";
		System.out.print(a[0][3]);
		
		for (String i=1;i<7;i++) {
			a[i][0] = i;
			System.out.print();
		}
		
		
		
		
		
		
		System.out.println("ab의 곱");
		for(int i =0; i< a.length;i++) {
			for(int j=0;j< b[0].length;j++) {
				int mul=0;
				int sum=0;
				for(int k=0; k< a[i].length;k++) {
					mul=a[i][k]*b[k][j];
					sum = sum+mul;
				}
				c[i][j] = sum;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}

	}



}

*/
