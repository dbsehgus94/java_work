package test;
import java.util.Scanner;
public class Test7_17 {
	static int linearSearch(int [] a, int key) {
		int idxTop = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				idxTop = i;
				break;
			}
		}
		return idxTop;
	}
	
	static int linearSearchR(int [] a, int key) {
		int idxBtm = 0;
		for(int i=a.length-1; i>=0; i--) {
			if(a[i]==key) {
				idxBtm = i;
				break;
			}
		}
		return idxBtm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int x = sc.nextInt();
		int [] a = new int [x];
		
		for(int i=0; i<x; i++) {
			System.out.print("x["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int key = sc.nextInt();
		System.out.println("해당 값의 요소가 여러 개 존재합니다.");
		System.out.println("가장 앞에 위치한 값은 x["+linearSearch(a, key)+"]에 있습니다.");
		System.out.println("가장 뒤에 위치한 값은 x["+linearSearchR(a, key)+"]에 있습니다.");
		
	}

}
/*
 * 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch 메서드와
 * linearSearchR 메서드를 작성하시오.
 * 단, 키와 같은 값을 가지는 요소가 여러 개인 경우, linearSearch는 가장 앞에 위치한 요소를 찾으며,
 * linearSearch은 가장 뒤에 위치한 요소를 찾을 것.
 * <실행 예>
 * 요소 수 : 6
 * x[0] : 5
 * x[1] : 22
 * x[2] : 74
 * x[3] : 32
 * x[4] : 120
 * x[5] : 22
 * 찾는 값 : 22
 * 해당 값의 요소가 여러개 존재합니다.
 * 가장 앞에 위치한 값은 x[1]에 있습니다.
 * 가장 뒤에 위치한 값은 x[5]에 있습니다.
 */