package ����ó��;

public class ���ܹ߻�2 {

	public static void main(String[] args) {
		int num=30;
		System.out.println("���� �߻���..ó������");
		//��� ó�� �κ��� ���⸦ ���� ��ǰ�� ���! 
	
		���� cal = new ����();
		cal.div(num);  //1������ ����ó��
		
		
		
		//ȣ���� ������ ����ó���� �ؾ���..
		try {
			cal.div2(num);
		} catch (Exception e) {
			System.out.println("ȣ���� ������ ����ó����");
		
		}
		
		
		System.out.println("���� �߻���..ó������");
		
		
		
	}

}
