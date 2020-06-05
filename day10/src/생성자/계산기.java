package 생성자;

import java.util.Date;
public class 계산기 {
	public int add(int x, int y) {
		return x+y;
	}
	
	public double add(int x, double y) {
		return x+y;
	}
	
	public String add(int x, String y) {
		return x+y;
	}
	
	public String add(String x, String y) {
		return x+y;
	}
	
	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	
	public Date add(int x) {
		Date date =new Date(x);
		return date;
	}

}
