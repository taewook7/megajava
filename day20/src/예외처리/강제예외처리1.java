package 예외처리;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 강제예외처리1 {

	public static void main(String[] args) {
		// 파일 입출력
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘날짜:");
		String day=sc.next();
		
		System.out.println("일기제목:");
		String title=sc.next();
		
		System.out.println("일기내용: ");
		String content=sc.next();
		
		FileWriter file= null;  //선언! 이떄 램에 저장공간 할당된다. 
		//선언의 위치가 사용할 수 있는 범위 ! 
		//지역변수, 초기화가 되지 않음.
		//참조형인 경우 null 로 초기화 시켜준다.! 
		
		
		
		try {
			file = new FileWriter(day + ".txt");
			file.write(day+"\n");
			file.write(title+"\n");
			file.write(content+"\n");
			
		} catch (IOException e) {	  //좁은범위부터 해서 
			System.out.println("파일로 저장시 에러가 발생함. 우아하게 처리함.");
		} catch (Exception e) {  //큰범위로 간다.  
			System.out.println("파일 입출력 이외의 에러가 발생함. 우아하게 처리함.");
			
		} finally {
			//반드시 처리해야할 내용이 있으면 넣어주세요.
			//에러발생 유무와 상관없이 무조건 처리해야하는 코드
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	}
}
