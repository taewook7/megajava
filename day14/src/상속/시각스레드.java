package 상속;

import java.util.Date;

public class 시각스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			//오늘 현재 날짜와시각 
			Date date = new Date();
			
			System.out.println("현재: "+date);
			try {
				Thread.sleep(1000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
			} catch (Exception e) {
				// TODO: handle exception
			}  			
		}
	
	}
}
