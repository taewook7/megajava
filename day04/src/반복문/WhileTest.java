package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		int count =10; // 시작값 1 
		while (count <= 15) {
			System.out.println(count+"무한루프를 돌려보자.!!");
			count += 1;
		}
		
		System.out.println("-------------------------");
		for (int i =10; i<= 15 ; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");
		while (true) {
			//cpu는 저장위치에 직접적으로 접근 불가.
			//cpu는 처리할 모든 데이터, 프로그램을 RAM에다 가져다놓고 써야한다.
			//자주 쓰는 것들은 이미 RAM에 넣어놓은 상태
			//=> 대문자를 써서 바로 사용할 수 있다.
			String hour=JOptionPane.showInputDialog("지금 몇시예요(종료x)?");  // . 점은 접근연산자이다.
			// x를 눌렀는지 확인해야 함.
			// x를 눌렀으면, 그만 반복문을 끝내는 처리! 
			if (hour.equals("x")) {
				System.out.println("시스템을 종료합니다.");
				break; // 자신을 포함하고 있는 반복문을 끝내준다.
			}
			System.out.println(hour + "시 입니다."); //결합연산자.(string이  하나라도있으면)
			
		}
		
		// 별을 10개 찍어보세요.
		int k=1;
		for (int i = 1; i <=10; i++) {
			
			System.out.println(i+"★");
		}
		
	}

}
