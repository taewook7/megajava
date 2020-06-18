package 상속;

public class 카운터스레드 extends Thread { 
	@Override
	public void run() {
		for (int i = 500; i >=0 ; i--) {
			System.out.println("카운터: "  + i);
			try {
				Thread.sleep(1000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
			} catch (Exception e) {
				// TODO: handle exception
			}  			
			
		}
	
	}
}
