package ũ�Ѹ�;

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

public class �ֽ�ũ�Ѹ� {

	public static void main(String[] args) {
		JFrame f = new JFrame("���� �ֽ� ũ�Ѹ�");
		FlowLayout flow = new FlowLayout();
		JButton b1 = new JButton("��Ʈ����");
		JButton b2 = new JButton("�Ｚ����");
		JButton b3 = new JButton("�Ｚ����");
		JButton b4 = new JButton("ũ�Ѹ�����");
		JLabel l = new JLabel("CODE:");
		JTextField input = new JTextField(7);
		JTextArea result = new JTextArea(5,7); //5�ٿ� 10���ڱ��� 
		Font font = new Font("�ü�ü",Font.BOLD,40);
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
		
		f.getContentPane().setBackground(Color.yellow);  // ���� �÷� 
		result.setEnabled(false);  // �۾� �Է� ���ϰ� �ϱ� 
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data="068270";
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				���̹�.naver(data);
				String[] values = ���̹�.naver(data);
				result.append("���簡: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
				result.append("�ð�: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
			}
		});
		
		b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						result.setText(" ");
						String data="009150";
						���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
						���̹�.naver(data);
						String[] values = ���̹�.naver(data);
						result.append("���簡: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
						result.append("�ð�: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
					}
				});
		
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data="028260";
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				���̹�.naver(data);
				String[] values = ���̹�.naver(data);
				result.append("���簡: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
				result.append("�ð�: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
				
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				String data = input.getText();
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				String[] values = ���̹�.naver(data);
				result.append("���簡: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
				result.append("�ð�: "+ values[0]+ "\n"); // ��� ���δ� append  settext�� ���� ���ƾ���..
			
				
			}
		});
		
		
		f.setVisible(true);
	}

}
