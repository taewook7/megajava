package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,950);
		
		JLabel img= new JLabel();
		f.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		
		JLabel n1=new JLabel("숫자1");
		JLabel n2=new JLabel("숫자2");
		
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		
		JButton plus =new JButton("+");
		JButton minus = new JButton("-");
		JButton 곱하기 = new JButton("*");
		JButton 나누기 = new JButton("/");
		
		JLabel number= new JLabel();
		
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		곱하기.setFont(font);
		나누기.setFont(font);
		
		f.add(n1);
		f.add(t1);
		f.add(n2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(곱하기);
		f.add(나누기);
		
		
		t1.setBackground(Color.green);
		t2.setForeground(Color.pink);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		plus.setBackground(Color.blue);
		plus.setForeground(Color.red);
		
		minus.setBackground(Color.blue);
		minus.setForeground(Color.red);
		
		곱하기.setBackground(Color.blue);
		곱하기.setForeground(Color.red);
		
		나누기.setBackground(Color.blue);
		나누기.setForeground(Color.red);
		
		JLabel result = new JLabel();
		f.add(result);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//내가 입력한 두 수를 가지고 와야함.
				//가지고올때는 get텍스트를 써야함
				String num1= t1.getText();
				String num2= t2.getText();
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				//더해서 출력해봅시다.
				System.out.println(num11 + num22);
				result.setText(num11 + num22 + "");
			}
		});
		
		minus.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			
						String num1= t1.getText();
						String num2= t2.getText();
						int num11 = Integer.parseInt(num1);
						int num22 = Integer.parseInt(num2);
						
					
						System.out.println(num11 - num22);
					}
				});
		곱하기.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String num1= t1.getText();
				String num2= t2.getText();
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
			
				System.out.println(num11 * num22);
			}
		});
		나누기.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String num1= t1.getText();
				String num2= t2.getText();
				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);
				System.out.println(num11 / num22);
			}
		});
		
		
// 결과값을 라벨을 사용하거나, 대화창을 이용해서 출력
// 사칙연산 - * / 
		
		
		
		f.setVisible(true);
		
	}

}
