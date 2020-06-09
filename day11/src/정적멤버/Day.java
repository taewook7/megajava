package 정적멤버;

public class Day {
	
	//인스턴스 변수 
	//인스턴스변수와 스태틱변수의 공통점은 글로벌 변수라는것 + 멤버변수라는것 (자동초기화 
	
	String doing;
	int time;
	String location;
	
	//스태틱 변수 
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
