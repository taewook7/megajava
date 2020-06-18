package 상속;

public class 동시스레드 {

	public static void main(String[] args) {
		카운터스레드 counter = new 카운터스레드();
		시각스레드 time = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		
		
		counter.start();
		time.start();
		array.start();
		
		
		
	}

}
