package 정적멤버;

import java.awt.Color;

import javax.swing.JOptionPane;

public class 스태틱변수메소드 {

	public static void main(String[] args) {
		String age=JOptionPane.showInputDialog("나이를 입력");
		int age2=Integer.parseInt(age);
		System.out.println("내년 나이는 " + (age2 + 1));
		System.out.println(Color.red);
		
	}

}
