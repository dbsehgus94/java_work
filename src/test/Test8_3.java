package test;

class Car {
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getTankage() {
		return tankage;
	}

	public void setTankage(double tankage) {
		this.tankage = tankage;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getSfc() {
		return sfc;
	}

	public void setSfc(double sfc) {
		this.sfc = sfc;
	}

	public Car(String name, String number, int width, int height, int length, double x, double y, double tankage,
			double fuel, double sfc) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		x = 0.0;
		y = 0.0;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
	}
	
	
	void displaySpec() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + number);
		System.out.println("�� : " + name);
		System.out.println("�̸� : " + name);
		System.out.println("�̸� : " + name);
		System.out.println("�̸� : " + name);
		System.out.println("�̸� : " + name);
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy); //�̵��Ÿ�
		double requiredFuel = dist / sfc; //�̵��� �ʿ��� ����
		if (requiredFuel>fuel) {
			return false;
		} else {
			fuel -= requiredFuel;
			x+=dx;
			y+=dy;
			return true;
		}
	}
	
	void refuel(double supplyFuel) {
		if (supplyFuel > 0) {
			fuel += supplyFuel;
			if(fuel > tankage) {
				fuel = tankage;
			}
		}
	}

}

public class Test8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
/* �ڵ��� Ŭ���� Car�� �ۼ��Ͻÿ�.
 * �̸�, ��ȣ(String)/ ��, ���� ����(int)/ ���� ��ġ X, Y ��ǥ, ��ũ �뷮, ���� ����,
 * ����(double)�� �ʵ�� �����ϴ�.
 * ������ġ X, Y ��ǥ�� �ҷ�����, ���� ���� �ҷ�����, ��� ǥ���ϱ�, ������ X, Y ���� ��ŭ
 * �ڵ��� �̵��ϱ�, �����ϱ��� �޼��� �����ϴ�.
 * �����ڵ� �ۼ��մϴ�.(���� �� X, Y ��ǥ�� ��� 0, ����� ��ũ �뷮�� �ʰ��� �� ����.)
 */
