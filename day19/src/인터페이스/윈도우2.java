package �������̽�;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������2 extends JFrame {
	JButton b1, b2,b3 ; // ���������� ����.
	public ������2() {
		setTitle("���� ������");
		setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b1 = new JButton("��ư1");
		b2 = new JButton("��ư2");
		b3 = new JButton("��ư3");
		
		add(b1);
		add(b2);
		add(b3);
		Font font = new Font("�ü�", Font.BOLD, 50);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(new Font("����",Font.ITALIC,60)); //�ѹ������Ÿ� �̷��� ��ε�~ 
		
		//		��ưŬ��ó�� ó�� = new ��ưŬ��ó��();
			//�͸� Ŭ������ ������ü����
			//�������̽��� ��ü ���� �Ұ� !
			
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1�� ȣ����.");
				
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2�� ȣ����");
				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("b3�� ȣ����");
			
			
			
			}
		});
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ������2(); //�͸�!
	}
	
	

	}
