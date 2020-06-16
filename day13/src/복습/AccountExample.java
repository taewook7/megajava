package 복습;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList(); //계좌목록 관리할 class 
		
		
		
		
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);

			} 
		if (choice==1) { //계좌객체 생성후 , list 에 추가처리
			System.out.println("------------------------------");
			System.out.println("계좌생성중.");
			System.out.println("------------------------------");
			System.out.print("계좌번호: ");
			String no =sc.next();
			System.out.print("계좌주: ");
			String name =sc.next();			
			System.out.print("초기입금액: ");
			int money =sc.nextInt();			
			Account a = new Account(no,name,money);
			list.add(a);
			
			
		} else if (choice==2) {  //계좌목록

			System.out.println("-------------");
			System.out.println("계좌목록");
			System.out.println("-------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
			
			
		} else if (choice==3) {
			System.out.println("----------");
			System.out.println("예금");
			System.out.println("-----------");
			System.out.println("계좌번호: ");
			String no=sc.next();
			
			
			int index = 0; // 리스트 내의 계좌 위치 
			for (int i = 0; i < list.size(); i++) {
				Account a = (Account)list.get(i);
				if(a.no.equals(no)) {
					index =i;
				}
			}
//			int index = Integer.parseInt(no);
			Account a = (Account)list.get(index);
			System.out.println("입금액: ");
			int input =sc.nextInt();
			a.money=a.money+input;
			System.out.println("예금처리 완료.!");
		
		} else if (choice==4) {
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("-----------");
			System.out.println("계좌번호: ");
			String no=sc.next();  //1
			int index = Integer.parseInt(no);
			Account a = (Account)list.get(index -1);
			System.out.println("출금액: ");
			int output =sc.nextInt();
			a.money=a.money-output;
			System.out.println("출금처리완료!");
			
			int money =sc.nextInt();
		} else {
			System.out.println("없는 항목입니다. 확인하고 다시 입력해주세요.");
		}  //else end 
		} // while end
		
		
	} //main end

} // class end 
