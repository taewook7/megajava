package 복습;

public class Tv {
	int channel;  // 멤버변수, 전역변수 , 자동초기화 
	int volume; // 메소드 영역 
	boolean onOff;
	static int count;  //static 으로 인해 누적이 됨 
	
	//생성자 오버로딩, 입력값만 다르게하면 메소드 이름을 동일하게 쓸수있음
	public Tv(int channel, int volume, boolean onOff) {
		count++;  //정적변수 공유해서 사용하는 변수 
//		System.out.println("객체 생성 개수는 "+count);
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
	
	
	
	
}
