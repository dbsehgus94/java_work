package exception;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		//if(right==0) {
		//	throw new IllegalArgumentException("두 번째 인자의 값은 0이 될 수 없습니다.");
		//}
		this.left = left;
		this.right= right;
	}
	
	public void divide() {
		if (this.right == 0) {
			throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
		}
		try {
			System.out.print("계산결과는");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		//c1.divide();
		
		try {
			c1.divide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		//Calculator c2 = new Calculator();
		//c2.setOperands(10, 5);
		//c2.divide();
		

	}

}
