package test;
import java.util.Scanner;
public class Test7_12 {
	/*
	private static void setBit(byte[] data, int pos, int val) {
		int posByte = pos/8;
		int posBit = pos%8;
		byte oldByte = data[posByte];
		oldByte = (byte) (((0xFF7F>>posBit)&oldByte)& 0x00FF);
		byte newByte = (byte) ((val<<(8-(posBit+1))) | oldByte);
		data[posByte] = newByte;
	}
	
	private static int getBit(byte[] data, int pos) {
		int posByte = pos/8;
		int posBit = pos%8;
		byte valByte = data[posByte];
		int valInt = valByte>>(8-(posBit+1)) & 0x0001;
		return valInt;
	}
	
	private static byte[] rotateLeft(byte[] in, int len, int step) {
		int numOfBytes = (len-1)/8 + 1;
		byte[] out = new byte[numOfBytes];
		for (int i=0; i<len; i++) {
			int val = getBit(in, (i+step)%len);
			setBit(out,i,val);
		}
		
		return out;
	}
	
	
	private static byte[] rotateRight(byte[] in, int len, int step) {
		int numOfBytes = (len-1)/8 + 1;
		byte[] out = new byte[numOfBytes];
		int check;
		int st = step;
		for (int i=0; i<len; i++) {
			check = i - step;
			if(check < 0) {
				check = len - st;
				--st;
			}
			
			int val = getBit(in, (check)%len);
			setBit(out,i,val);
		}
		return out;
	}
	*/
	//bit �� ����ϴ� �Լ� - ��Ʈ ������ (|, &)
	static void printBits(int x) {
		for(int i=31; i>=0; i--) {
			System.out.print( ((x >>> i & 1) == 1)? '1': '0');
		}
	}
	
	static int rotateRight(int x, int n) {
		if(n<0) {
			return rotateLeft(x, -n);
		}
		int ret;
		n  = n % 32;
		ret = (n==0? x : (x >>> n) | (x << 32-n));
		
		
		
		return ret;
	}
	
	static int rotateLeft(int x, int n) {
		if(n<0) {
			return rotateRight(x, -n);
		}
		int ret;
		n  = n % 32;
		ret = (n==0? x : (x << n) | (x >>> 32-n));
		
		
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		int L = Integer.rotateLeft(x, n);
		int R = Integer.rotateRight(x, n);
		int L2 = rotateLeft(x, n);
		int R2 = rotateRight(x, n);
		
		//byte[] R2 = rotateRight(, x, n);
		System.out.println("ȸ�� �� = "+x);
		System.out.println("���� ȸ�� = "+L);
		System.out.println("������ ȸ�� = "+R);
		System.out.print("\n���� ȸ�� = ");
		printBits(rotateLeft(x, n));
		System.out.print("\n������ ȸ�� = ");
		printBits(rotateRight(x, n));
		
		//System.out.println("������ ȸ�� = "+R2);
		
	}

}
/*
���� x�� ���������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rotateRight �޼����

�������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rotateLeft �޼��带 �ۼ��Ͻÿ�.
int rotateRight();
int rotateLeft();
������
0000 0010
0000 0001
1000 0000
0100 0000

����
0100 0000
1000 0000
0000 0001
0000 0010

<���� ��>
x : 1565857138
n : 6
ȸ�� �� = 
������ ȸ�� = 
���� ȸ�� =

*/