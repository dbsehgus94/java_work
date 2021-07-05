package test;

class Human1 {
	private String name;
	private int height;
	private int weight;

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Human1(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void show() {
		System.out.println("이름 : " + getName());
		System.out.println("신장 : " + getHeight() + "cm");
		System.out.println("체중 : " + getWeight() + "kg");
		System.out.println();
	}

	public void gainWeight(int changeweight) {
		System.out.println(name + " : " + changeweight + "=>" + weight + "kg");
		System.out.println();
		//this.weight += weight;
	}

	public void reduceWeight(int changeweight) {
		System.out.println(name + " : " + changeweight + "=>" + weight + "kg");
		System.out.println();
		//this.weight -= weight;
	}
}

public class Test8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 gildong = new Human1("길동", 170, 63);
		Human1 chulsu = new Human1("철수", 166, 67);

		gildong.show();
		gildong.gainWeight(60);
		chulsu.show();
		chulsu.reduceWeight(72);
	}
}
/*
 * 이름, 신장 체중 등을 멤버로 가지는 '사람 클래스'를 작성하시오. 1. 생성자를 사용해서 작성하시오. 2. 필드는 외부에서 직접 수정이
 * 불가능하도록 작성하시오. 3. 외부에서 필드를 확인할 수(가져올 수) 있는 메서드를 작성하시오. 4. 체중이 증가, 감소를 메서드로
 * 작성하시오.(매개 변수 : 변화 체중) - 길동 : 60 => 63kg, 철수 : 72 => 67kg
 * 
 * 
 */