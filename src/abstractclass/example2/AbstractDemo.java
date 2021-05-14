package abstractclass.example2;

abstract class A {
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){ System.out.println("Hello") }
	
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
	
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {
		return 1;
		// 오버라이딩 할 때 메소드는 같아야한다.
		// 상속해서 쓸 수 밖에 없게 강제하는 기능
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B obj = new B();

	}

}
