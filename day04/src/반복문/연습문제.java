package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class �������� {
	public static void main(String[] args) {
	int count=0;	
		
	//String data =JOptionPane.showInputDialog("�����Է� ����:x");	
		
	Random r=new Random();
	while (true) {
		count++;
		String exit =JOptionPane.showInputDialog("�����ұ��?x, ����ұ��?o");
		if (exit.equals("x")) {
			System.out.println("�����մϴ�."+(count -1) +"ȸ �õ���");
			break;
		}
	
		int num1 = r.nextInt(100);
		int num2 = r.nextInt(100);
		System.out.println(num1);
		System.out.println(num2);
		if (num1 > num2) {
			System.out.println("�տ��ִ� ���ڰ� ��Ŀ��");
		} else {
			System.out.println("�ڿ��ִ� ���ڰ� ��Ŀ��");

		} 
	}
	}
}
