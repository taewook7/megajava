package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class �������ð� {

	public static void main(String[] args) {

		//�ð��� �����ִ� Ŭ����
		//Date, Calendar 
		Date date = new Date();  //�����ϴ� Ű���� c����̺꿡�ִ°� �����ؼ� ���� ����־� 
		int time = date.getHours();
		System.out.println("����ð��� "+ date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		
		//���ǹ�
		if (time>=22) {
			JOptionPane.showMessageDialog(null, "�������ð��� �󸶾ȳ��ҳ׿�.");
		} else {
			JOptionPane.showMessageDialog(null, "�������ð��� ���̳��ұ���.");

		}
	
	}

}
