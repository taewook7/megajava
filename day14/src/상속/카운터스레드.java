package ���;

public class ī���ͽ����� extends Thread { 
	@Override
	public void run() {
		for (int i = 500; i >=0 ; i--) {
			System.out.println("ī����: "  + i);
			try {
				Thread.sleep(1000); // �ܺ��ڿ��� ���������Ƿ� ��������� 1000 �̸� 1����  			
			} catch (Exception e) {
				// TODO: handle exception
			}  			
			
		}
	
	}
}
