package �������̽�;

public class BananaCar implements Car {

	@Override //������
	public void speedUp() {
		System.out.println("�ٳ��� �ӵ��� Up");
	}

	@Override
	public void speedDown() {
		System.out.println("�ٳ��� �ӵ��� Down");
	}

	@Override
	public void stop() {
		System.out.println("�ٳ��� �ӵ��� Stop");
	}

}
