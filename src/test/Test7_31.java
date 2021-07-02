package test;
import java.util.Scanner;
public class Test7_31 {
	static int absolute(int x) { //다중 메서드 absolute 생성
		if(x<0) { //x값이 0보다 작다면
			x = x*-1; //x에 -1을 곱한다.
			return x; //x를 반환한다.
		}
		return x; //if조건에 해당하지 않는다면 x를 반환한다.
	}
	static long absolute(long x) { //다중 메서드 absolute 생성
		if(x<0) { //x값이 0보다 작다면
			x = x*-1; //x에 -1을 곱한다.
			return x; //x를 반환한다.
		}
		return x; //if조건에 해당하지 않는다면 x를 반환한다.
	}
	static float absolute(float x) { //다중 메서드 absolute 생성
		if(x<0) { //x값이 0보다 작다면
			x = x*-1; //x에 -1을 곱한다.
			return x; //x를 반환한다.
		}
		return x; //if조건에 해당하지 않는다면 x를 반환한다.
	}
	static double absolute(double x) { //다중 메서드 absolute 생성
		if(x<0) { //x값이 0보다 작다면
			x = x*-1; //x에 -1을 곱한다
			return x; //x를 반환한다.
		}
		return x; //if조건에 해당하지 않는다면 x를 반환한다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("int 형 정수 a의 값 : ");
		int a = sc.nextInt(); //int a 입력
		System.out.print("long 형 정수 b의 값 : ");
		long b = sc.nextLong(); //long b 입력
		System.out.print("float 형 정수 c의 값 : ");
		float c = sc.nextFloat(); //float c 입력
		System.out.print("double 형 정수 d의 값 : ");
		double d = sc.nextDouble(); //double d 입력
		
		System.out.println("a의 절대값 : "+absolute(a)); //int a의 절대값 출력
		System.out.println("b의 절대값 : "+absolute(b)); //long b의 절대값 출력
		System.out.println("c의 절대값 : "+absolute(c)); //float c의 절대값 출력
		System.out.println("d의 절대값 : "+absolute(d)); //double d의 절대값 출력
		
	}

}
/*
 * int 형 변수 x의 절대값, long형 변수 x의 절대값, float형 변수 x의 절대값, double형 변수 x의 절대값을 구하는 다중 메서드를 작성하자.
 * absolute()
 */