package Ŭ����;




import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;




public class �ٹ� {
static	int now = 2; // ������ġ(������ġ)



	public static void main(String[] args) {
		
		String[] list = {"002.png", "003.png", "004.png", "005.png", "006.png"};
		//������ ������� ��ġ�� ��û �߿��ϴ�.. 
		//������ ��ġ�� ������ �� �� �ִ� ����
		String[] title = {"�������","�������̽�������","�����Ѽ��","ī��","�̽���"};
		
		JFrame f = new JFrame();
		JLabel text = new JLabel();
		text.setText(title[now]);
		
		JLabel top = new JLabel();

		JButton left = new JButton("<<<<<");

		JButton right = new JButton(">>>>>");
		
		
		

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);
		f.add(text);
		f.add(top);

		f.add(left);

		f.add(right);

		ImageIcon icon = new ImageIcon(list[now]);
		top.setIcon(icon);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(now>0) {
					now--;
				} else {
					now =4;
				}
				
				ImageIcon icon = new ImageIcon(list[now]);
				top.setIcon(icon);
				text.setText(title[now]);
			}
		});
		
		
		ImageIcon icon1 = new ImageIcon(list[now]);
		top.setIcon(icon1);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(now<4) {
					now++;
				} else {
					now =0;
				}
				
				ImageIcon icon = new ImageIcon(list[now]);
				top.setIcon(icon);
				text.setText(title[now]);
			}
		});
		

		Font font = new Font("�ü�", Font.BOLD, 50);

		left.setFont(font);

		right.setFont(font);
		
		text.setFont(font);

		left.setBackground(Color.yellow);

		right.setBackground(Color.yellow);

		left.setForeground(Color.red);

		right.setForeground(Color.blue);

		

		

		

		

		f.setSize(400, 550);

		f.setVisible(true);

	}




}
