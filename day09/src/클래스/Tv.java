package Ŭ����;

public class Tv {
	//������� , ��������(�ڵ� �ʱ�ȭ) 
	int ch; //������ ����� ��ġ�� ����� �� �ִ� ����. 
	//���� �������� �ʾ����� int�� 0�����ʱ�ȭ��� �Ҹ��� false �� �ʱ�ȭ���. ���������ϱ� 
	//�� ���������İ� ��ü���� �����־ class tv�� ��ü���� 
	boolean onoff;

	//��ü������ ������ �ڵ����� ���! call(ȣ���ϴ�)
	//�׷��� ������ (�޼ҵ�) ��� �Ѵ�.
	public Tv(int x,boolean y) {
		ch=x;
		onoff=y;
	}
	
	//����޼���
	public void on() {
		System.out.println("Tv�� �Ѵ�.");
		
	}
	public void off() {
		System.out.println("Tv�� ����");
	}
	
	
	// ������ (override, �������̵�)
	public String toString() {
		return "ä����"+ ch + ", ������ " + onoff;
	}
	
	
	
	
}
