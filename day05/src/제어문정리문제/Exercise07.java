package 제어문정리문제;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int account =10000;
		int money = 0;
		account+= money;
		
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------");
			System.out.print("선택>> ");
			int scan = sc.nextInt(); //String ->int 
			
			if (scan == 1) {
				System.out.println("입금액 >> ");
				money=sc.nextInt();
				account+= money;
				//예금을 받아서 통장에 넣어야함
				System.out.println("예금은 "+account);
			} else if (scan == 2) {
				//출금을 받아서 통장에서 빼야함
				System.out.println("출금액 >> ");
				money=sc.nextInt();
				account-= money;
				System.out.println("남은 잔액은 " +account);
				

				
			} else if (scan == 3) {
				//통장에 들어 있는 돈 빼야함
				System.out.println("잔고 = " + account);
				
				
				
				
				
				
			} else if (scan == 4) {
				//프로그램 종료!4
				System.out.println("3초뒤종료합니다.\n" + "2초뒤종료합니다.\n" +"종료중..1\n" + "시스템을 종료합니다.");
				System.exit(0);
			}

			else {

			} 
		}
	
	}

}
