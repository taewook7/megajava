package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 집에갈시간 {

	public static void main(String[] args) {

		//시간을 구해주는 클래스
		//Date, Calendar 
		Date date = new Date();  //복사하는 키워드 c드라이브에있는걸 복사해서 램에 집어넣어 
		int time = date.getHours();
		System.out.println("현재시간은 "+ date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		
		//조건문
		if (time>=22) {
			JOptionPane.showMessageDialog(null, "집에갈시간이 얼마안남았네요.");
		} else {
			JOptionPane.showMessageDialog(null, "집에갈시간이 많이남았군요.");

		}
	
	}

}
