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
		System.out.println("���� x�� n��Ʈ ����Ʈ �մϴ�.");
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("n: ");
		int n = sc.nextInt();
		int n1 = pow2(n);
		int n2 = x*n1;
		int n3 = x/n1;
		int n4 = x << n;
		int n5 = x >> n;
		
		System.out.println("[a]x * (2�� "+n+"��) = "+n2);
		System.out.println("[b]x / (2�� "+n+"��) = "+n3);
		System.out.println("[c]x << "+n+" = "+n4);
		System.out.println("[d]x >> "+n+" = "+n5);
		
		if(n2==n4) {
			System.out.println("[a]�� [c]�� ���� ��ġ�մϴ�.");
		}
		if(n2!=n4) {
			System.out.println("[a]�� [c]�� ���� ��ġ���� �ʽ��ϴ�.");
		}
		if(n3==n5) {
			System.out.println("[b]�� [d]�� ���� ��ġ�մϴ�.");
		}
		if(n3!=n5) {
			System.out.println("[b]�� [d]�� ���� ��ġ���� �ʽ��ϴ�.");
		}
		
	}

}
/*
������ �¿�� ����Ʈ�� ����. '����x2�� �ŵ�����' �� '����/2�� �ŵ� ����'�� ������ Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
<��� ����>
���� x�� n��Ʈ ����Ʈ �մϴ�.
x: 100
n: 3
[a]x * (2�� 3��) = 800
[b]x / (2�� 3��) = 12
[c]x << 3 = 800
[d]x >> 3 = 12
[a]�� [c]�� ���� ��ġ�մϴ�.
[b]�� [d]�� ���� ��ġ�մϴ�.
2�� �ŵ������� ��ȯ�ϴ� �޼���
����Ÿ�� pow2(�Ű�����){
	return ���ϰ�;
}
*/ 