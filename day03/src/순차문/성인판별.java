package ������;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {
		//�̸��� �Է��ؼ�, ���.
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���.");  //�ܺο��� �����ö� ���� String 
		
		// age�� int �� �ٲ������
		int age2= Integer.parseInt(age);   //pasre=�м��ϴ�  �м��ؼ� �������� int�� �ٲܰ� 
		
		JOptionPane.showMessageDialog(null, "����� �̸��� " +name);
		JOptionPane.showMessageDialog(null, "����� ���̴� "+age2);
		//���ǹ�
		if (age2>=18) {
		//	System.out.println(name + "���� �����Դϴ�");
			JOptionPane.showMessageDialog(null, name+ "���� �����Դϴ�.");
		} else {
//			System.out.println(name + "���� ������ �ƴմϴ�.");
			JOptionPane.showMessageDialog(null, name+ "���� �̼������Դϴ�.");

		}
	
	}

}
