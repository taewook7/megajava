package ����;

public class Car {
	//Ư¡(������)
	//���� => ������� ,��������(�ڵ��ʱ�ȭ)(Ŭ������ü���� �����ֵ����ؼ� ��������) 
	String wheel; //������� �������� �� null �� �ʱ�ȭ�ȴ�.
	int speed; //�ӵ�, 0 
	//��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ带 ���鿹��, ������ �޼ҵ� ��� �Ѵ�.
	//������ �޼ҵ�� ��ȯ�� ǥ������ �ʴ´�. ��δ� void ~~ 
	//������ �޼ҵ�� Ŭ���� �̸��� �����ϰ� ������ �Ѵ�.
	// �Ķ���� �ִ� ������ 
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}
	
	
	//���� => ����޼ҵ�(�Լ�), �Է°�, ��ȯ������
	// �Ű�����=����� �Ķ������ (parameter)
	public void speedup(int speed) {//SPEEDUP(50)
		this.speed = this.speed +speed; // this �� �ش�Ŭ������ �ǹ���. 
		System.out.println(this.speed + "�� �ӵ��� Up!");
	
	}
	

	public int nowSpeed() {
		return speed;
	}
	
	public void SpeedDown() {
		System.out.println("�ӵ��� DOWN!");
	}


	@Override  //�������̵�  , ����� ������  
	public String toString() {
		return "�ڵ��� [����=" + wheel + ", �ӵ�=" + speed + "]";
	}
	
	
	
}
