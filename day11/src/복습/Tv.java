package ����;

public class Tv {
	int channel;  // �������, �������� , �ڵ��ʱ�ȭ 
	int volume; // �޼ҵ� ���� 
	boolean onOff;
	static int count;  //static ���� ���� ������ �� 
	
	//������ �����ε�, �Է°��� �ٸ����ϸ� �޼ҵ� �̸��� �����ϰ� ��������
	public Tv(int channel, int volume, boolean onOff) {
		count++;  //�������� �����ؼ� ����ϴ� ���� 
//		System.out.println("��ü ���� ������ "+count);
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
}
