package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 연습문제 {
	public static void main(String[] args) {
	int count=0;	
		
	//String data =JOptionPane.showInputDialog("숫자입력 종료:x");	
		
	Random r=new Random();
	while (true) {
		count++;
		String exit =JOptionPane.showInputDialog("종료할까요?x, 계속할까요?o");
		if (exit.equals("x")) {
			System.out.println("종료합니다."+(count -1) +"회 시도함");
			break;
		}
	
		int num1 = r.nextInt(100);
		int num2 = r.nextInt(100);
		System.out.println(num1);
		System.out.println(num2);
		if (num1 > num2) {
			System.out.println("앞에있는 숫자가 더커요");
		} else {
			System.out.println("뒤에있는 숫자가 더커요");

		} 
	}
	}
}
