package ���;

public class ���۸� extends �� {
	//����3��,�޼ҵ�2���� ������ �����Ѵ�.
	
	boolean sky;
	public void space() {
		System.out.println(name+ " �� ���ָ� ����");
	}
	
	
	@Override  // Annotation(ǥ��,������̼� ) 
	//�ǹ̾��� Ȯ�ο뵵 ������̼��� �ְ�  
	// �ǹ� �ִ� Ư���� ó���뵵�� �ִ�. 
	public void run() {
		System.out.println("���� �ӵ��� �޸���."); //�θ��� run ����� ������ 
	}
	
	
	
	@Override
	public String toString() {
		return "���۸� [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
