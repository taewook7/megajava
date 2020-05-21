package 반복문;

import java.util.Scanner;

public class 콘솔에서바로입력 {

	public static void main(String[] args) {
//		// Scanner 스캐너 (입력용, file, 키보드, 네트워크)
//		// String -- > int 명령어를 가지고 있음.
		Scanner sc=new Scanner(System.in);
//		System.out.print("나이를 입력>>");
//		int age = sc.nextInt();  // 입력도 받아오고 인트로도 되고 
//	
//		System.out.println("당신의 나이는" + age);
//	    //내년 나이를 출력해보세요.
//		
//		int age2 = age+1;
//		System.out.println("당신의 내년나이는 "+age2+"입니다.");
		
//--------------------------------------------------------------
		//두 수를 입력받아서, 누가 더 큰가.? 
		System.out.print("num1 >> ");
		int num1=sc.nextInt();
		System.out.print("num2 >>");
		int num2=sc.nextInt();
		if (num1>num2) {
			System.out.println("num1 " + num1 + " 이 더크네요");
		} else {
			System.out.println("num2 " + num2 + " 이 더크네요");
		}

	}

}
