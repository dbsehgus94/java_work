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


//�Է��� int�� �������� ������ ��� -1, 0�� ��� 0, ����̸� 1�� ��ȯ�ϴ� signOf �ż��带 �ۼ��Ͻÿ�.