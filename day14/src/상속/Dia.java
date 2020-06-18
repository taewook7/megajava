package 상속;

public class Dia extends Thread {  //쓰레드를 상속받는다
	public void run() {
		// 스레드 처리하고 싶은 부분을 코딩
		for (int i = 0; i < 100; i++) {
			System.out.println("◆");
		}
		}
	
	
}
