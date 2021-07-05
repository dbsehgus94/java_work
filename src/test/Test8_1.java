package test;

class Human{
	String name;
	int height;
	int weight;	
}
public class Test8_1 {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human gildong = new Human();
		Human chulsu = new Human();
		
		gildong.name="길동";
		gildong.height=170;
		gildong.weight=60;
		
		chulsu.name="철수";
		chulsu.height=166;
		chulsu.weight=72;
		
		System.out.println("이름 : "+gildong.name);
		System.out.println("신장 : "+gildong.height+"cm");
		System.out.println("체중 : "+gildong.weight+"cm");
		System.out.println();
		
		System.out.println("이름 : "+chulsu.name);
		System.out.println("신장 : "+chulsu.height+"cm");
		System.out.println("체중 : "+chulsu.weight+"cm");
		System.out.println();
		

	}

}

/*
 *<Class>
 *이름, 신장, 체중 등을 멤버로 가지는 '사람 클래스'를 작성하시오.
 *<실행 예>
 *이름 : 길동
 *신장 : 170cm
 *체중 : 60kg
 *
 *이름 : 철수
 *신장 : 166cm
 *체중 : 72kg
 *
 */
