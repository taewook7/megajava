package ��ӻ�����;

//base import: jave.lang.*;   �Ǿ��ִ»����̴� 
public class �ϹݰԽ��� extends Object {
	int no;
	String title;
	String content;
	String writer;
	


	
//��� �����ڴ� �θ��־�� ������ 	
	public �ϹݰԽ���(int no, String title, String content, String writer) {
		super();   
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}





	@Override
	public String toString() {
		return "�ϹݰԽ��� [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
}
