package ����;

public class �������� {

	public static void main(String[] args) {
		//����
		int hour = 7;
		
		//�Ǽ�
		double min = 0.49;
		
		//����
		char day = 'ȭ';
		
		//��
		boolean food = true; // false 
		
		System.out.println("���� �ð��� "+hour+"��");   // . �� �����ε��ٰ��ؼ� ���ٿ����� ��� �Ѵ�. 
		System.out.println("���� ���� "+min+"��");
		System.out.println("���� ������ "+day+"����");
		System.out.println("�Ļ翩�δ� "+food);
		
		String     name = "ȫ�浿" ;    // �⺻�� �̿ܿ� �������̸� Ư���ϰ� �⺻��ó�� ������������.
		
		/////////////////////////////
		int num1 = 200; // ���� ���������� 
		int num2 = 100;  
		System.out.println(num1 == num2);  // �Ȱ���? ��� �񱳿�����  cpu�� ���Ѵ�. �񱳿������� ����� ������ boolean
		
		
		String n1="ȫ�浿";
		String n2="�ڱ浿";
		System.out.println(n1.equals(n2));  // �⺻���� �ƴϹǷ� == �񱳿����� ���Ұ�. 
		
		if (n1.equals(n2)) { //true
			System.out.println("�������̽ñ���");
		} else { //false
			System.out.println("�������� �ƴϽñ���.!");
		}

		
	}

}
