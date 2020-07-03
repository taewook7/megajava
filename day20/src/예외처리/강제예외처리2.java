	package 예외처리;

public class 강제예외처리2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver2");
		} catch (ClassNotFoundException e) {
			System.out.println("커넥터 파일이 존재하지않습니다.");
		}
		System.out.println("DB연결 처리...");
		
		
		
		
	}

}
