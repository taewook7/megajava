package 크롤링;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 주식크롤링 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		FlowLayout flow = new FlowLayout();
		JButton b1 = new JButton("셀트리온");
		JButton b2 = new JButton("삼성전기");
		JButton b3 = new JButton("삼성물산");
		JButton b4 = new JButton("크롤링시작");
		JLabel l = new JLabel("CODE:");
		JTextField input = new JTextField(7);
		JTextArea result = new JTextArea(5,7); //5줄에 10글자까지 
		Font font = new Font("궁서체",Font.BOLD,40);
		f.setLayout(flow);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l.setFont(font);
		input.setFont(font);
		result.setFont(font);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		
		l.setForeground(Color.red);
		input.setBackground(Color.green);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		f.add(input);
		f.add(b4);
		f.add(result);
		
		
		
		f.setSize(370, 770);
		
		f.getContentPane().setBackground(Color.yellow);  // 바탕 컬러 
		result.setEnabled(false);  // 글씨 입력 못하게 하기 
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data="068270";
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				네이버.naver(data);
				String[] values = 네이버.naver(data);
				result.append("현재가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
				result.append("시가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
			}
		});
		
		b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						result.setText(" ");
						String data="009150";
						네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
						네이버.naver(data);
						String[] values = 네이버.naver(data);
						result.append("현재가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
						result.append("시가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
					}
				});
		
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data="028260";
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				네이버.naver(data);
				String[] values = 네이버.naver(data);
				result.append("현재가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
				result.append("시가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
				
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data = input.getText();
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				String[] values = 네이버.naver(data);
				result.append("현재가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
				result.append("시가: "+ values[0]+ "\n"); // 계속 붙인다 append  settext를 쓰면 갈아엎음..
			
				
			}
		});
		
		
		f.setVisible(true);
	}

}
