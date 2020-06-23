package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//리시버도 전화기가 있어야한다 마찬가지로
		DatagramSocket socket = new DatagramSocket(9000); //보내는쪽에서 7000 으로줬기때문에 
		// 받는쪽에서 7000 으로 넣어줘야함~
		
		System.out.println("받는 쪽 소켓 시작.............");
		System.out.println("받을 준비 끝..........기다리는중");
		
		byte[] data= new byte[256];
		DatagramPacket packet = new DatagramPacket(data,data.length); //받을때는 데이터만 받으면 됨~
		socket.receive(packet);
		System.out.println(new String(data)); //우리가 찍을려면 스트링으로 만들어줘야함
		socket.close();  // 계속 대화를주고받으려면 클로즈를 하면안된다 보내는쪽도 
		
	}

}
