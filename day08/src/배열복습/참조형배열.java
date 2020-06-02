package 배열복습;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형배열 {

	public static void main(String[] args) {
		// 데이타 타입이 참조형인 경우
		JButton[] buttons=new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			JButton b = new JButton(i+"번");
			buttons[i]=b;
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource()); //어떤버튼을 눌렀는지 알수있음.
					
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
