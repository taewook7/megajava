package ��ӻ�����;

public class ���ǰԽ��� extends �ϹݰԽ��� {
	String reply;
	
//	public ���ǰԽ���() {
//		
//	}
//	
//	public ���ǰԽ���(String reply) {
//		super();
//		this.reply=reply;
//	}
//	
	
	public ���ǰԽ���(int no, String title, String content, String writer, String reply) {
		//����Ŭ������ �Ķ���� ������
		//����Ŭ������ �����ڴ� �ݵ�� �ڽ�Ŭ���� ������ ù��!! 
		//�Ķ���� �ִ� �����ڴ� ��������� �� �������
		
		super(no, title, content, writer);
		this.reply = reply;
	}


	


	@Override
	public String toString() {
		return "���ǰԽ��� [reply=" + reply + ", no=" + no + ", title=" + title + ", content=" + content + ", writer="
				+ writer + "]";
	}
	
}
