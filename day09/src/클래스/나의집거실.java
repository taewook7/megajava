package Ŭ����;

public class �������Ž� {

	public static void main(String[] args) {
		Tv tv1 = new Tv(100,false); //��������, �ʱ�ȭ �����ʾƿ� 
//		tv1.ch=100;
//		tv1.onoff=false;
		tv1.on();
		
		Tv tv2 = new Tv(0, false);
		tv1.ch=200;
		tv1.onoff=true;
		tv1.off();
		System.out.println(tv1);
		
		
		��ȭ�� ��ȭ��1 = new ��ȭ��();
		��ȭ�� ��ȭ��2 = new ��ȭ��();
		
		��ȭ��1.����="����";
		��ȭ��1.�︮��();
		System.out.println(��ȭ��1.����);
		
		��ȭ��2.off = false;
		��ȭ��1.on=true;
		System.out.println(��ȭ��2.off);
		
		
	}

}
