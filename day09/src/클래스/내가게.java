package Ŭ����;

public class ������ {

	public static void main(String[] args) {
		���� cal = new ����();
		int count =5;
		int salary =1000000;
		
		
		int result1= cal.mul(count,salary);
		
		int count2 =8;
		int salary2 =1200000;
		
		int result2 = cal.mul(count2,salary2);
		
		//�� �ް� ������ ������ ����ϰ�ʹ�.
	
		int result3 = cal.add(result1,result2);
		if (result3>=10300000) {
			System.out.println("������ �ʹ��ǳ׿�");
		} else {
			System.out.println("������ �Һ񿴳׿�");
		}
	}
}

//Ŭ������ ���鶧�� �ϳ��� ���Ҹ� �����ϵ��� ������ �Ѵ�.
//�������� ���� ���� ����.! (�̰����� ��� ���������Ҹ�) 
