package ����;

public class Person {

	public static void main(String[] args) {
		Car car = new Car("�ݰ����", 150);
		//��ü ������ Ŭ�����̸��� ������ �޼ҵ�� �ڵ�ȣ���� �ȴ�.
		//��ü ������ �ݵ�� ���־���ϴ� �ʱ⼳���� �ϱ� ����
//		car.wheel ="�ݱ����";
//		car.speed= 150;
		System.out.println(car.nowSpeed());
		car.speedup(50);
		System.out.println(car.nowSpeed());
		car.SpeedDown();
		System.out.println(car.toString());
	}

}
