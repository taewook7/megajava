package 그래픽;

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
		
		JButton spring = new JButton("봄");
		JButton summer = new JButton("여름");
	
		
		Font font =new Font("궁서", Font.BOLD, 100);
		spring.setFont(font);
		summer.setFont(font);
		spring.setBackground(Color.yellow);
		summer.setBackground(Color.pink);
		spring.setForeground(Color.blue);
		summer.setForeground(Color.green);
		
		spring.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");  // f 로 두면 그 위에 뜬다.
			}
		}); 
		
		summer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		}); 
		
		
		
		f.add(spring);
		f.add(summer);

		
		
		
		
		
		f.setVisible(true);
	}

}
