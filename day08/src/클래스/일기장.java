package Ŭ����;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class �ϱ��� {

	public static void main(String[] args) throws Exception {
		// �Է��� �޾ƺ���.
		
		String day= JOptionPane.showInputDialog("��¥�Է�");
		String title = JOptionPane.showInputDialog("�����Է�");
		String content = JOptionPane.showInputDialog("�����Է�");
		
				
		//��ġ�����ؼ� ����.
//		File file = new File("c:/imsi");
//		System.out.println("������ ������ ? "  +file.exists());
		FileWriter file = new FileWriter(day+".txt");
		file.write(day + "\n");
		file.write(title+"\n");
		file.write(content+"\n");
		file.close();
		
	}

}
