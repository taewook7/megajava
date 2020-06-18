package 상속;

public class 배열스레드 extends Thread {
	String[] s= {"감자","고구마","양파","당근","포도"};
	@Override
	public void run() {
	for (int i = 0; i < s.length; i++) {
		System.out.println("음식이름: " + s[i]);
		
		try {
			Thread.sleep(3000); // 외부자원을 연결했으므로 에러가뜬다 1000 이면 1초임  			
		} catch (Exception e) {
			// TODO: handle exception
		}  			
	}
	
	
	
	}
	
	
}
