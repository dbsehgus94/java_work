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
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + number);
		System.out.println("폭 : " + name);
		System.out.println("이름 : " + name);
		System.out.println("이름 : " + name);
		System.out.println("이름 : " + name);
		System.out.println("이름 : " + name);
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy); //이동거리
		double requiredFuel = dist / sfc; //이동에 필요한 연료
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
/* 자동차 클래스 Car를 작성하시오.
 * 이름, 번호(String)/ 폭, 높이 길이(int)/ 현재 위치 X, Y 좌표, 탱크 용량, 남은 연료,
 * 연비(double)을 필드로 가집니다.
 * 현재위치 X, Y 좌표를 불러오기, 남은 연료 불러오기, 사양 표시하기, 지시한 X, Y 방향 만큼
 * 자동차 이동하기, 급유하기의 메서들 가집니다.
 * 생성자도 작성합니다.(생성 시 X, Y 좌표는 모두 0, 연료는 탱크 용량을 초과할 수 없음.)
 */
