package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//���ù��� ��ȭ�Ⱑ �־���Ѵ� ����������
		DatagramSocket socket = new DatagramSocket(9000); //�������ʿ��� 7000 ������⶧���� 
		// �޴��ʿ��� 7000 ���� �־������~
		
		System.out.println("�޴� �� ���� ����.............");
		System.out.println("���� �غ� ��..........��ٸ�����");
		
		byte[] data= new byte[256];
		DatagramPacket packet = new DatagramPacket(data,data.length); //�������� �����͸� ������ ��~
		socket.receive(packet);
		System.out.println(new String(data)); //�츮�� �������� ��Ʈ������ ����������
		socket.close();  // ��� ��ȭ���ְ�������� Ŭ��� �ϸ�ȵȴ� �������ʵ� 
		
	}

}
