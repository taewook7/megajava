package 반복문;

import java.util.Random;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class 숫자맞추기 {
	public static void main(String[] args) {
		//아무값이나 만들어주는 부품(class)을 써보자!
		Random r=new Random();
		
		int target = r.nextInt(100); // 0부터 99까지  
		int count =0; 
		while (true) {
	
		String data =JOptionPane.showInputDialog("숫자입력 종료:x");
		count++;
		int target2 = Integer.parseInt(data);
		
			
		if (target==target2) {
			System.out.println("정답입니다.");
			System.out.println("당신의 시도횟수는 " +count + "회");
			System.out.println("시스템을 종료합니다.");
			
			break;
		
		} else {
			System.out.println("정답이 아닙니다.");
			//입력한 값이 정답보다 큰지, 작은지 힌트를 주세요.
			if (target <target2) {
				System.out.println("너무커요.");
			} else {
				System.out.println("넘 작아요.");
			}
			
		
			}
		}
	}

}
