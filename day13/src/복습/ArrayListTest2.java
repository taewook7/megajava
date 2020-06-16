package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		//버튼의 목록을 관리해줄 클래스. 
		
		ArrayList list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			JButton b = new JButton(i + "번");
			list.add(b);
		}
		for (int i = 0; i < list.size(); i++) {
			JButton b2=(JButton)list.get(i);
			System.out.println(b2.getText());
		}
		
		
		
		
		
	}

}
