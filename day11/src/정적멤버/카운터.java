package 정적멤버;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {
	static int count;  // 밑에 메인메소드가 스태틱이라서 여기도 안으로 들어가려면 스태틱이어야함 
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		JLabel number = new JLabel("0");
		JButton b1 = new JButton("1더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");
		
		FlowLayout flow = new FlowLayout();
		
		//일반메소드는 스태틱메소드의 반대말이고
		//일반메소드는 반드시 객체 생성후,객체의 주소로 접근해야한다 예를들어 . 점을 의미함. 
		f.setSize(300, 300);
		Font font = new Font("궁서체",Font.BOLD,150);
		number.setFont(font);
		number.setForeground(Color.red);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
				
				
			}
		});
		
		
		b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						count =0;
						number.setText(String.valueOf(count));
						
						
					}
				});


		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 count--;
				 number.setText(String.valueOf(count));
				
				
			}
		});
				
				
		
	
		f.setVisible(true);
		f.setLayout(flow);
	}

}
