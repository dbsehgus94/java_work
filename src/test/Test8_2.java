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
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getHeight() + "cm");
		System.out.println("ü�� : " + getWeight() + "kg");
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
		Human1 gildong = new Human1("�浿", 170, 63);
		Human1 chulsu = new Human1("ö��", 166, 67);

		gildong.show();
		gildong.gainWeight(60);
		chulsu.show();
		chulsu.reduceWeight(72);
	}
}
/*
 * �̸�, ���� ü�� ���� ����� ������ '��� Ŭ����'�� �ۼ��Ͻÿ�. 1. �����ڸ� ����ؼ� �ۼ��Ͻÿ�. 2. �ʵ�� �ܺο��� ���� ������
 * �Ұ����ϵ��� �ۼ��Ͻÿ�. 3. �ܺο��� �ʵ带 Ȯ���� ��(������ ��) �ִ� �޼��带 �ۼ��Ͻÿ�. 4. ü���� ����, ���Ҹ� �޼����
 * �ۼ��Ͻÿ�.(�Ű� ���� : ��ȭ ü��) - �浿 : 60 => 63kg, ö�� : 72 => 67kg
 * 
 * 
 */