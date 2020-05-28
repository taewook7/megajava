package 배열심화;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		//배열은 자동 초기화, int=>0으로 초기화
		//예매가 되는 자리는 1로 변경
		int count=0;

		
		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("원하는 좌석번호를 입력하세요(종료는 -1) : ");
			int number = sc.nextInt(); // 1
			if (number==-1) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("예매수 >> " +count);
				System.out.println("총구매금액은 >> "+ count*10000);
				break;
			}
			//예매하기 전에 그 자리가 이미 예매가 된 자리인지 확인해야함.
			if (seat[number - 1] ==1) { //예매된 자리
				System.out.println("예매 불가능");
			} else {
				//예매처리
				
				seat[number - 1] = 1;
				System.out.println("예매완료!");
				count++;
				
			}
		}
		
	}

}
