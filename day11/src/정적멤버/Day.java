package �������;

public class Day {
	
	//�ν��Ͻ� ���� 
	//�ν��Ͻ������� ����ƽ������ �������� �۷ι� ������°� + ���������°� (�ڵ��ʱ�ȭ 
	
	String doing;
	int time;
	String location;
	
	//����ƽ ���� 
	static int count;
	static int totalTime;
	
	
	public Day(String doing, int time, String location) {
		count++;
		totalTime +=time;  //totalTime= TotalTime+time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
	
}
