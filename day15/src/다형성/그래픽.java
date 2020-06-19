package 다형성;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("나는 버튼");
		JLabel l = new JLabel("나는 라벨");
		JTextField t = new JTextField(10); //10글자만 들어가게
		
		//다형성, overloading 
		//부모클래스 타입이 들어갈 수 있는 자리는 자식 클래스가 다 들어갈 수 있다.
		//부모의 이름으로 설정을 해두면, 자식의 이름으로 만들어진 
		//객체를 다 집어넣을 수 있다.
		f.add(b);
		f.add(l);
		f.add(t);
		
		
		f.setLayout(new FlowLayout());
		f.setSize(500, 500);
		f.setVisible(true);
		
	}

}
