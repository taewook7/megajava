package 전달용클래스;

import java.util.Scanner;

public class 입력화면 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요.: ");
		String number = sc.next();
		System.out.println("제목을 입력하세요.: ");
		String title=sc.next();
		System.out.println("내용을 입력하세요>: ");
		String content=sc.next();
		System.out.println("글쓴이는? ");
		String writer=sc.next();
		
		입력화면DAO dao = new 입력화면DAO();
		입력화면DTO dto = new 입력화면DTO();
		
		dto.setNumber(number);
		dto.setContent(content);
		dto.setTitle(title);
		dto.setWriter(writer);
		
		dao.insert(dto);
	}

}
