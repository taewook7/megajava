package 상속생성자;

public class 문의게시판 extends 일반게시판 {
	String reply;
	
//	public 문의게시판() {
//		
//	}
//	
//	public 문의게시판(String reply) {
//		super();
//		this.reply=reply;
//	}
//	
	
	public 문의게시판(int no, String title, String content, String writer, String reply) {
		//수퍼클래스의 파라미터 생성자
		//수퍼클래스의 생성자는 반드시 자식클래스 생성자 첫줄!! 
		//파라미터 있는 생성자는 명시적으로 꼭 해줘야함
		
		super(no, title, content, writer);
		this.reply = reply;
	}


	


	@Override
	public String toString() {
		return "문의게시판 [reply=" + reply + ", no=" + no + ", title=" + title + ", content=" + content + ", writer="
				+ writer + "]";
	}
	
}
