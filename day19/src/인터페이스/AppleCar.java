package �������̽�;

public class AppleCar implements Car {

	@Override //������
	public void speedUp() {
		System.out.println("�ӵ��� Up");
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ��� Down");
	}

	@Override
	public void stop() {
		System.out.println("�ӵ��� Stop");
	}

}
