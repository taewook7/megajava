package �ݺ���;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		int count =10; // ���۰� 1 
		while (count <= 15) {
			System.out.println(count+"���ѷ����� ��������.!!");
			count += 1;
		}
		
		System.out.println("-------------------------");
		for (int i =10; i<= 15 ; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");
		while (true) {
			//cpu�� ������ġ�� ���������� ���� �Ұ�.
			//cpu�� ó���� ��� ������, ���α׷��� RAM���� �����ٳ��� ����Ѵ�.
			//���� ���� �͵��� �̹� RAM�� �־���� ����
			//=> �빮�ڸ� �Ἥ �ٷ� ����� �� �ִ�.
			String hour=JOptionPane.showInputDialog("���� ��ÿ���(����x)?");  // . ���� ���ٿ������̴�.
			// x�� �������� Ȯ���ؾ� ��.
			// x�� ��������, �׸� �ݺ����� ������ ó��! 
			if (hour.equals("x")) {
				System.out.println("�ý����� �����մϴ�.");
				break; // �ڽ��� �����ϰ� �ִ� �ݺ����� �����ش�.
			}
			System.out.println(hour + "�� �Դϴ�."); //���տ�����.(string��  �ϳ���������)
			
		}
		
		// ���� 10�� ������.
		int k=1;
		for (int i = 1; i <=10; i++) {
			
			System.out.println(i+"��");
		}
		
	}

}
