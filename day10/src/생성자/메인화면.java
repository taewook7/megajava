package ������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ����ȭ�� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ����ȭ��");
//		JFrame f2 = new JFrame("���� ����ȭ��");
		
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("���ϱ�");
		JButton b2 = new JButton("����");
		
		f.add(b1);
		f.add(b2);
		
		
		Font font = new Font("�ü�ü",Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���ϱ⻩����� cal = new ���ϱ⻩�����();	
				int result = cal.add(300, 100);
				JOptionPane.showMessageDialog(f, "���Ѱ��� "+result);
			}
		});
		
b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���ϱ⻩����� cal = new ���ϱ⻩�����();
				int result =cal.minus(200, 100);
				JOptionPane.showMessageDialog(f, "�A���� " +result);
		
			
			}
		});
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
