package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SpringSummer {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton spring = new JButton("��");
		JButton summer = new JButton("����");
	
		
		Font font =new Font("�ü�", Font.BOLD, 100);
		spring.setFont(font);
		summer.setFont(font);
		spring.setBackground(Color.yellow);
		summer.setBackground(Color.pink);
		spring.setForeground(Color.blue);
		summer.setForeground(Color.green);
		
		spring.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�����ؿ�");  // f �� �θ� �� ���� ���.
			}
		}); 
		
		summer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "������");
			}
		}); 
		
		
		
		f.add(spring);
		f.add(summer);

		
		
		
		
		
		f.setVisible(true);
	}

}
