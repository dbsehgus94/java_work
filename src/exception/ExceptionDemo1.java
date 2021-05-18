package exception;
import java.io.*;
class B {
	void run() {
		
	}
}

class C {
	void run() {
		B b = new B();
		b.run();
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		C c = new C();
		c.run();

	}

}
