package test;

public class Test7_1 {

	public static int signOf(int n) {
	
	int sign = 0;
	
	if (n>0) {
		sign=1;
	}
	else if(n<0) {
		sign=-1;
	}
	else if(n==0) {
		sign=0;
	}
	return sign;
	}
	
	public static void main(String[] args) {
		System.out.println(signOf(3));
		System.out.println(signOf(-88));
		System.out.println(signOf(0));
		System.out.println(signOf(1057));
		System.out.println(signOf(-157));
		
	}

}


//입력한 int형 정수값이 음수인 경우 -1, 0인 경우 0, 양수이면 1을 반환하는 signOf 매서드를 작성하시오.