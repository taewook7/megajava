package ��ӻ�����;

public final class Child extends Parent {
	//Ŭ�����տ� final �� ���̸� ���� ���̶�� ����. 
	//���� Ŭ����  300p 
	@Override
	void tv() {
		System.out.println("���ѵ����� ����.");
		

	}
	
	final void together() { //���� ���ϳ�? 
		tv();  // ���� tv�� ����. 
		super.tv(); //�θ���� tv�� ����.   �θ�Ŭ������ 
		//�޼ҵ带 ���⶧���� super.�޼ҵ� ��� ���� . å298p
	}
	
	
	
	
}
