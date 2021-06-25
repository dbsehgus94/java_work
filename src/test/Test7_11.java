package test;
import java.util.Scanner;
public class Test7_11 {
	
	static int pow2(int n) {
		int result = 1;
		for(int i=0; i<n;i++) {
			result = result*2;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 x를 n비트 시프트 합니다.");
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("n: ");
		int n = sc.nextInt();
		int n1 = pow2(n);
		int n2 = x*n1;
		int n3 = x/n1;
		int n4 = x << n;
		int n5 = x >> n;
		
		System.out.println("[a]x * (2의 "+n+"승) = "+n2);
		System.out.println("[b]x / (2의 "+n+"승) = "+n3);
		System.out.println("[c]x << "+n+" = "+n4);
		System.out.println("[d]x >> "+n+" = "+n5);
		
		if(n2==n4) {
			System.out.println("[a]와 [c]의 값이 일치합니다.");
		}
		if(n2!=n4) {
			System.out.println("[a]와 [c]의 값이 일치하지 않습니다.");
		}
		if(n3==n5) {
			System.out.println("[b]와 [d]의 값이 일치합니다.");
		}
		if(n3!=n5) {
			System.out.println("[b]와 [d]의 값이 일치하지 않습니다.");
		}
		
	}

}
/*
정수를 좌우로 시프트한 값이. '정수x2의 거듭제곱' 및 '정수/2의 거듭 제곱'과 같은지 확인하는 프로그램을 작성하시오.
<결과 예시>
정수 x를 n비트 시프트 합니다.
x: 100
n: 3
[a]x * (2의 3승) = 800
[b]x / (2의 3승) = 12
[c]x << 3 = 800
[d]x >> 3 = 12
[a]와 [c]의 값이 일치합니다.
[b]와 [d]의 값이 일치합니다.
2의 거듭제곱을 반환하는 메서드
리턴타입 pow2(매개변수){
	return 리턴값;
}
*/ 