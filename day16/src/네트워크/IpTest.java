package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws Exception {
		// 127.0.0.1  이렇게 쓰면 자바는 스트링인줄안다  
		
		
		// URL url = new URL("http://www.naver.com");
		
		InetAddress ip = InetAddress.getByName("127.0.0.1"); //아이피를 나타내는 클래스 
		System.out.println(ip);
		
		
		
		
	}

}
