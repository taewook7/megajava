package �������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ī���� {
	static int count;  // �ؿ� ���θ޼ҵ尡 ����ƽ�̶� ���⵵ ������ ������ ����ƽ�̾���� 
	
	public static void main(String[] args) {
		JFrame f = new JFrame("���� ī���� ���α׷�");
		JLabel number = new JLabel("0");
		JButton b1 = new JButton("1���ϱ�");
		JButton b2 = new JButton("0���� �ʱ�ȭ");
		JButton b3 = new JButton("1 ����");
		
		FlowLayout flow = new FlowLayout();
		
		//�Ϲݸ޼ҵ�� ����ƽ�޼ҵ��� �ݴ븻�̰�
		//�Ϲݸ޼ҵ�� �ݵ�� ��ü ������,��ü�� �ּҷ� �����ؾ��Ѵ� ������� . ���� �ǹ���. 
		f.setSize(300, 300);
		Font font = new Font("�ü�ü",Font.BOLD,150);
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
