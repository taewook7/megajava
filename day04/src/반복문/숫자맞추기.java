package �ݺ���;

import java.util.Random;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class ���ڸ��߱� {
	public static void main(String[] args) {
		//�ƹ����̳� ������ִ� ��ǰ(class)�� �Ẹ��!
		Random r=new Random();
		
		int target = r.nextInt(100); // 0���� 99����  
		int count =0; 
		while (true) {
	
		String data =JOptionPane.showInputDialog("�����Է� ����:x");
		count++;
		int target2 = Integer.parseInt(data);
		
			
		if (target==target2) {
			System.out.println("�����Դϴ�.");
			System.out.println("����� �õ�Ƚ���� " +count + "ȸ");
			System.out.println("�ý����� �����մϴ�.");
			
			break;
		
		} else {
			System.out.println("������ �ƴմϴ�.");
			//�Է��� ���� ���亸�� ū��, ������ ��Ʈ�� �ּ���.
			if (target <target2) {
				System.out.println("�ʹ�Ŀ��.");
			} else {
				System.out.println("�� �۾ƿ�.");
			}
			
		
			}
		}
	}

}
