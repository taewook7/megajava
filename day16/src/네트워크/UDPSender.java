	package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//��Ʈ��ũ�� �����ؼ� �����Ҷ��� 
		//class �� �ʿ� (��ȭ�⿪���� �ϴ� ������ �ʿ��� socket) 
		//
		DatagramSocket socket = new DatagramSocket();  // ��ȭ�⿪��
		// ���� �����Ұ� ������
		String str= "i am a python programmer!!!";
		//���� ���濡�� ��������  ������+�ּ� (ip+port)�� ������ packet !!! �⵿ 
		
		byte[] data = str.getBytes();  //����Ʈ ������ �ٲ㼭������ �����Ϳ� 
		InetAddress ip = InetAddress.getByName("127.0.0.1"); //�����Ǹ��־����
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8000);
		socket.send(packet); //�����°�
		socket.close();// ������ �Ҹ� ���ߴ� ������. 
		

		
		
		
		
	}

}
