package ������;

import javax.swing.JOptionPane;

public class ���̹��α��� {

	public static void main(String[] args) {
		String id = "root";  //ȸ���������� ���� id
		String id2= JOptionPane.showInputDialog("id�� �Է��ϼ���."); 
		
		System.out.println(id.equals(id2));
		if (id.equals(id2)) {
			System.out.println("�α��μ���");
		} else {
			System.out.println("�α��ν���");
		}
		
		String pw ="1111";
		String pw2 = "1111";
		
		if (id.equals(id2) && pw.equals(pw2)) {  // �̹̾տ��� false �� ���͹������� �ڿ� ����� �������ʴ´�.(������Ư¡)
			System.out.println("�α��μ���");
		} else {
			System.out.println("�α��ν���");
		}
		
		
		
	}

}
