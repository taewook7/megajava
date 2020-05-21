package 반복문;

import java.util.Scanner;

public class Switch연습문제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("당신이 좋아하는 과목은 ??");
		String data = sc.next(); // 한단어만 가져옴,nextLine() 한줄을가져옴
		switch (data) {
		case "자바": System.out.println("JSP로 점프");
			break;
		case "파이썬": System.out.println("장고로 점프");	
			break;
			
		default:System.out.println("무조건 열심히!");
			break;
		}
		
		
	}

}
