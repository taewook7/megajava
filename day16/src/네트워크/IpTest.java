package ��Ʈ��ũ;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws Exception {
		// 127.0.0.1  �̷��� ���� �ڹٴ� ��Ʈ�����پȴ�  
		
		
		// URL url = new URL("http://www.naver.com");
		
		InetAddress ip = InetAddress.getByName("127.0.0.1"); //�����Ǹ� ��Ÿ���� Ŭ���� 
		System.out.println(ip);
		
		
		
		
	}

}
