package �迭����;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �������迭 {

	public static void main(String[] args) {
		// ����Ÿ Ÿ���� �������� ���
		JButton[] buttons=new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			JButton b = new JButton(i+"��");
			buttons[i]=b;
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource()); //���ư�� �������� �˼�����.
					
				}
			});
		}
		
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int  i= 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		

		
		
		
		f.setVisible(true);
	}

}
