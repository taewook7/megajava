package ���;

public class �迭������ extends Thread {
	String[] s= {"����","����","����","���","����"};
	@Override
	public void run() {
	for (int i = 0; i < s.length; i++) {
		System.out.println("�����̸�: " + s[i]);
		
		try {
			Thread.sleep(3000); // �ܺ��ڿ��� ���������Ƿ� ��������� 1000 �̸� 1����  			
		} catch (Exception e) {
			// TODO: handle exception
		}  			
	}
	
	
	
	}
	
	
}
