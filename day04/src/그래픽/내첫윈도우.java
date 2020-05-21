package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		//창 큰거 한번 띄워보자.
		//버튼만들어서 창에서 넣어보자.
		JFrame f = new JFrame();  // 큰틀을 복사 
		f.setSize(500, 500);
		
		JButton b = new JButton();
		b.setText("나를 눌러요");
		b.setBackground(Color.yellow);   //배경색
		b.setForeground(Color.blue);	 //글자색
		
		f.add(b);  //f창에 b(버튼을) 끼우는것임
		
		JButton b2 = new JButton();
		b2.setText("나도 눌러요");
		b2.setBackground(Color.pink);   //배경색
		b2.setForeground(Color.blue);	 //글자색
		
		f.add(b2); 
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		f.setVisible(true); // false 가 기본값으로 적용되있기때문에
		//창이안뜨는것이었음. 프레임이 계속 보이게 하면ㄴ서 떠있는 것.
		
//		JFrame a = new JFrame();
//		a.setSize(900, 900);
//		a.setVisible(true);
	}

}
