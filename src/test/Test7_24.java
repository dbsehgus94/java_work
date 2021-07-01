package test;
import java.util.Scanner;
import java.util.Arrays;
public class Test7_24 {
	static int[] searchArrayIdx(int a[], int searchvalue) { //검색한 값을 반환하는 메서드 생성
		int count=0; //변수 지정
		int [] c = new int[a.length]; //배열 생성
		for(int i=0; i<a.length; i++) { //검색한 값의 배열 순번을 또 다른 배열로 지정하기 위한 반복문 
			if(a[i]==searchvalue) { //a 배열의 값이 검색값과 같다면
				c[count] = i;//c 배열에 배열 순번인 i값을 입력
				count++; // 입력 후 count+1
			}
		}
		if(count == 0) { //일치하는 요소가 없다면 출력
			System.out.println("일치하는 요소가 없음");
		}
		int [] b = new int[count]; //검색한 값에 맞춰 새로운 배열 b생성
		for(int i = 0; i<b.length; i++) { //b 배열에 값을 입력하기 위한 반복문
			b[i] = c[i]; //앞서 c 배열에 입력한 값을 b 배열에 옮겨준다.
		}
		return b; //b 배열을 반환
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : "); 
		int x = sc.nextInt(); //요소 수 입력
		int [] a = new int [x]; // 배열 a 생성
		for(int i=0;i<a.length;i++) {//배열 a의 요소값을 입력하기 위한 반복문
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt(); //배열 a의 요소값 입력
		}
		System.out.println("배열 a "+Arrays.toString(a));//배열 a 출력
		System.out.print("검색 값 : ");
		int searchvalue = sc.nextInt(); //검색 값 입력
		System.out.println("반환되는 배열은 "+Arrays.toString(searchArrayIdx(a, searchvalue))); //검색한 값을 반환하는 메서드 출력
		
	}

}
/*
 * 배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로
 * 저장해서 반환하는 searchArrayldx 메서드를 작성하시오.
 * 
 * 예) 배열 a의 요소가 {1, 5, 4, 8, 5, 5, 7}이고 값이 5인 요소의 인덱스를 나열하면,
 * 반환되는 배열은 {1, 4, 5}
 */