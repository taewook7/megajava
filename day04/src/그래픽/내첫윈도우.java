package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ù������ {

	public static void main(String[] args) {
		//â ū�� �ѹ� �������.
		//��ư���� â���� �־��.
		JFrame f = new JFrame();  // ūƲ�� ���� 
		f.setSize(500, 500);
		
		JButton b = new JButton();
		b.setText("���� ������");
		b.setBackground(Color.yellow);   //����
		b.setForeground(Color.blue);	 //���ڻ�
		
		f.add(b);  //fâ�� b(��ư��) ����°���
		
		JButton b2 = new JButton();
		b2.setText("���� ������");
		b2.setBackground(Color.pink);   //����
		b2.setForeground(Color.blue);	 //���ڻ�
		
		f.add(b2); 
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		f.setVisible(true); // false �� �⺻������ ������ֱ⶧����
		//â�̾ȶߴ°��̾���. �������� ��� ���̰� �ϸ餤�� ���ִ� ��.
		
//		JFrame a = new JFrame();
//		a.setSize(900, 900);
//		a.setVisible(true);
	}

}
