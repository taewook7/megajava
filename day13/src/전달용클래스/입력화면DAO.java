package 전달용클래스;

public class 입력화면DAO {
	public void insert(입력화면DTO dto) {
		System.out.println("db에 접속함");
		System.out.println("저장된 번호는 " + dto.getNumber());
		System.out.println("저장된 제목은 " + dto.getTitle());
		System.out.println("저장된 내용은 " + dto.getContent());
		System.out.println("저장된 글쓴이는 " +dto.getWriter());
		System.out.println("db에 저장완료");
	}
	
	
}
