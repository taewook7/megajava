package ����ó��;

public class ���ܹ߻�1 {

	public static void main(String[] args) {
		int num=30;
		System.out.println("���� �߻���..ó������");
		try {
			//������ �߻��� �� ���� �ڵ�
			System.out.println(num/0);  // �̹����� �����ϸ� 
			
		} catch (Exception e) {  //������ �߻��ϸ� ��ƶ� 
			//������ �߻��ϸ� ��� ó���� �� �ڵ�
//			e.printStackTrace();
			System.out.println("��� ���� ������ �߻��Ͽ� ó����");
		}
		
		System.out.println("���� �߻���..ó������");
		
		
		
	}

}
