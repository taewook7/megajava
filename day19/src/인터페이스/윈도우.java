package �������̽�;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������ extends JFrame implements ActionListener{
	JButton b1, b2; // ���������� ����.
	public ������() {
		setTitle("���� ������");
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b1 = new JButton("��ư1");
		b2 = new JButton("��ư2");
		
		add(b1);
		add(b2);
		Font font = new Font("�ü�", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
//		��ưŬ��ó�� ó�� = new ��ưŬ��ó��();
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ������(); //�͸�!
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==b1) {
		System.out.println("b1 ��ư�� ������.");
	}
	
	if (e.getSource()==b2) {
		System.out.println("b2 ��ư�� ������.");
	}
	}
}
