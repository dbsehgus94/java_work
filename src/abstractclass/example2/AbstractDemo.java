package abstractclass.example2;

abstract class A {
	public abstract int b();
	//��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	//public abstract int c(){ System.out.println("Hello") }
	
	//�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.
	
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {
		return 1;
		// �������̵� �� �� �޼ҵ�� ���ƾ��Ѵ�.
		// ����ؼ� �� �� �ۿ� ���� �����ϴ� ���
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B obj = new B();

	}

}
