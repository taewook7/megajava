package ���;

import java.util.Date;

public class �ð������� extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			//���� ���� ��¥�ͽð� 
			Date date = new Date();
			
			System.out.println("����: "+date);
			try {
				Thread.sleep(1000); // �ܺ��ڿ��� ���������Ƿ� ��������� 1000 �̸� 1����  			
			} catch (Exception e) {
				// TODO: handle exception
			}  			
		}
	
	}
}
