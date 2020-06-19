package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {  // Exception 이 제일큼 예외처리잡아주는게
		//승인용 소켓이 필요
		//네트워크와 같은 외부연결은 무조건 예외처리! 해야함
		//계속살아있어야하므로 무한루프가 돌아야함 
		//포트를 설정하지않으면, 5자리의 임의의 포트를 만들어서 전송
		//2자리만들어도되고 4자리만들어도됨 근데 일반적으론 5자리 만듬 
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 소켓 시작됨..");
		System.out.println("클라이언트의 연결을 기다리는 중...");
	
		
		
		int count =0; //연결된 클라이언트수 
		while (true) {
			Socket socket = server.accept(); //데이터 전달용 소켓임
			count++;
			System.out.println("클라이언트와 연결 성공...!!!");
			System.out.println(count+ "개 의 클라이언트와 연결");
		
		}
		
		
	}

}
