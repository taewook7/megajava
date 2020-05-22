package 제어문정리문제;

import java.util.Scanner;

public class 인기투표문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int 아이유 =0;
		int 유재석=0;
		int 방탄=0;
		
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.아이유|2.유재석|3.방탄|4.종료");
			System.out.println("-----------------");
			System.out.print("당신의 선택은 ? >> ");
			int scan = sc.nextInt(); //String ->int 
			
			if (scan == 1) {
				아이유=아이유+1;
				System.out.println("아이유 >> "+아이유);
				System.out.println("유재석 >> "+유재석);
				System.out.println("방탄 >> "+방탄);
				
			} else if (scan == 2) {
				유재석=유재석+1;
			} else if (scan == 3) {
				방탄++;
			} else if (scan == 4) {
				//프로그램 종료!4
				System.out.println("투표를 종료합니다. "+"\n");
				System.out.println("아이유: "+아이유 + "표");
				System.out.println("유재석: "+유재석 + "표");
				System.out.println("방탄: "+방탄 + "표");
				System.exit(0);
				
			}

			else {
				System.out.println("1~4사이의 값을 선택해주세요.");
			} 
		}
	
	}

}
