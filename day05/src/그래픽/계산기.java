package �׷���;

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

public class ���� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,950);
		
		JLabel img= new JLabel();
		f.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		
		JLabel n1=new JLabel("����1");
		JLabel n2=new JLabel("����2");
		
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		
		JButton plus =new JButton("+");
		JButton minus = new JButton("-");
		JButton ���ϱ� = new JButton("*");
		JButton ������ = new JButton("/");
		
		JLabel number= new JLabel();
		
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("���� ���", Font.BOLD, 50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		���ϱ�.setFont(font);
		������.setFont(font);
		
		f.add(n1);
		f.add(t1);
		f.add(n2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(���ϱ�);
		f.add(������);
		
		
		t1.setBackground(Color.green);
		t2.setForeground(Color.pink);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		plus.setBackground(Color.blue);
		plus.setForeground(Color.red);
		
		minus.setBackground(Color.blue);
		minus.setForeground(Color.red);
		
		���ϱ�.setBackground(Color.blue);
		���ϱ�.setForeground(Color.red);
		
		������.setBackground(Color.blue);
		������.setForeground(Color.red);
		
		JLabel result = new JLabel();
		f.add(result);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���� �Է��� �� ���� ������ �;���.
				//������ö��� get�ؽ�Ʈ�� �����
				String num1= t1.getText();
				String num2= t2.getText();
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				//���ؼ� ����غ��ô�.
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
		���ϱ�.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String num1= t1.getText();
				String num2= t2.getText();
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
			
				System.out.println(num11 * num22);
			}
		});
		������.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String num1= t1.getText();
				String num2= t2.getText();
				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);
				System.out.println(num11 / num22);
			}
		});
		
		
// ������� ���� ����ϰų�, ��ȭâ�� �̿��ؼ� ���
// ��Ģ���� - * / 
		
		
		
		f.setVisible(true);
		
	}

}
