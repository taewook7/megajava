	package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//네트워크로 연결해서 전송할때는 
		//class 가 필요 (전화기역할을 하는 소켓이 필요함 socket) 
		//
		DatagramSocket socket = new DatagramSocket();  // 전화기역할
		// 이제 전달할걸 만들어보자
		String str= "i am a python programmer!!!";
		//이제 상대방에게 보내보자  데이터+주소 (ip+port)를 가지고 packet !!! 출동 
		
		byte[] data = str.getBytes();  //바이트 단위로 바꿔서들어가야함 데이터에 
		InetAddress ip = InetAddress.getByName("127.0.0.1"); //아이피를넣어야함
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8000);
		socket.send(packet); //보내는거
		socket.close();// 난이제 할말 다했다 끝낸다. 
		

		
		
		
		
	}

}
