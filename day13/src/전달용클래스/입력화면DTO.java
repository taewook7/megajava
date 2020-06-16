package 전달용클래스;

public class 입력화면DTO {
	String number;
	String title;
	String content;
	String writer;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "입력화면DTO [number=" + number + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
}
