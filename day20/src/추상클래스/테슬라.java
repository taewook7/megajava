package �߻�Ŭ����;

// �׽��� class: ���赵�� �� �־���ϴ� ����� ������ class
// car interface: �� �־�� �ϴ� ����� ������ ���� 


public abstract class �׽��� implements Car {
	String name; //�Ϲݺ���
	
	//�߻�Ŭ������ �߻�޼ҵ�,�Ϲݸ޼ҵ�,�Ϲݺ��� �� �� �������ִ�.
	//�߻� �޼ҵ� (������) 
	public abstract void �ƴ�();
	
	
public void run() {
	
	System.out.println("����� �޸���.");
	//����ó���� �ϰ� ���� ��� 
	//try~catch, throws �� �ϳ�.
	//�޼ҵ带 �������ϴ� ���, throws �� ���Ұ� .
	
	
	try {
		System.out.println(300/0);
		
	} catch (Exception e) {

	}

}
	
	
}
