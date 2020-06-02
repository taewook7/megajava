package 클래스;




import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;




public class 앨범 {
static	int now = 2; // 현재위치(시작위치)



	public static void main(String[] args) {
		
		String[] list = {"002.png", "003.png", "004.png", "005.png", "006.png"};
		//변수는 만들어진 위치가 엄청 중요하다.. 
		//선언의 위치가 변수가 살 수 있는 범위
		String[] title = {"언더워터","프리즌이스케이프","위대한쇼맨","카페","미스비"};
		
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
		

		Font font = new Font("궁서", Font.BOLD, 50);

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
