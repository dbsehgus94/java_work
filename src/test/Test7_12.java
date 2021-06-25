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
	//bit 를 출력하는 함수 - 비트 연산자 (|, &)
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
		System.out.println("회전 전 = "+x);
		System.out.println("왼쪽 회전 = "+L);
		System.out.println("오른쪽 회전 = "+R);
		System.out.print("\n왼쪽 회전 = ");
		printBits(rotateLeft(x, n));
		System.out.print("\n오른쪽 회전 = ");
		printBits(rotateRight(x, n));
		
		//System.out.println("오른쪽 회전 = "+R2);
		
	}

}
/*
정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rotateRight 메서드와

왼쪽으로 n비트 회전한 값을 반환하는 rotateLeft 메서드를 작성하시오.
int rotateRight();
int rotateLeft();
오른쪽
0000 0010
0000 0001
1000 0000
0100 0000

왼쪽
0100 0000
1000 0000
0000 0001
0000 0010

<실행 예>
x : 1565857138
n : 6
회전 전 = 
오른쪽 회전 = 
왼쪽 회전 =

*/