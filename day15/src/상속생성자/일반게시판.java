package 상속생성자;

//base import: jave.lang.*;   되어있는상태이다 
public class 일반게시판 extends Object {
	int no;
	String title;
	String content;
	String writer;
	


	
//모든 생성자는 부모가있어야 존재함 	
	public 일반게시판(int no, String title, String content, String writer) {
		super();   
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}





	@Override
	public String toString() {
		return "일반게시판 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
}
