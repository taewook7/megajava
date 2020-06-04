package 정리문제;

public class 컴퓨터구매 {

	public static void main(String[] args) {
		int monitor=200000;
		int body = 300000;
		int count =3 ;
		컴퓨터 com = new 컴퓨터();
		int comResult=com.computer(monitor, body);
		com.total(count, comResult);
		
		
	}
}
