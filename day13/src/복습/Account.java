package ����;

public class Account {
	String no; //���¹� ȣ
	String name; //�����̸�
	int money; //�ʱ� �Աݾ�
	
		//��ü ������ �ڵ�ȣ��Ǵ� �޼ҵ�: ������ �޼ҵ�
		//�Է°��� ���� �޼ҵ尡 ȣ��ȴ�.
		//�Ķ���� �ִ� �����ڸ� ����������
		//��ü ������ �ݵ�� �ʿ��� �׸���� ������ �� �ִ�.
		//��������� ���� �������� �����ڸ� ���.!! 
	
	public Account(String no, String name, int money) {
		//super(); //default! 
		//super�� ������ ������ ���� �ؾ���.
		
		this.no = no;
		this.name = name;
		this.money = money;
	}

	
		//��������� ���� ����Ҷ��� toString�� ���!!! 
	@Override
	public String toString() {
		return "Account [no=" + no + ", name=" + name + ", money=" + money + "]";
	}
	
	
	
	
	
	
	
}
