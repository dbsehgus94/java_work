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
		
		gildong.name="�浿";
		gildong.height=170;
		gildong.weight=60;
		
		chulsu.name="ö��";
		chulsu.height=166;
		chulsu.weight=72;
		
		System.out.println("�̸� : "+gildong.name);
		System.out.println("���� : "+gildong.height+"cm");
		System.out.println("ü�� : "+gildong.weight+"cm");
		System.out.println();
		
		System.out.println("�̸� : "+chulsu.name);
		System.out.println("���� : "+chulsu.height+"cm");
		System.out.println("ü�� : "+chulsu.weight+"cm");
		System.out.println();
		

	}

}

/*
 *<Class>
 *�̸�, ����, ü�� ���� ����� ������ '��� Ŭ����'�� �ۼ��Ͻÿ�.
 *<���� ��>
 *�̸� : �浿
 *���� : 170cm
 *ü�� : 60kg
 *
 *�̸� : ö��
 *���� : 166cm
 *ü�� : 72kg
 *
 */
