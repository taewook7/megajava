package 배열;

public class 배열연습문제3 {

	public static void main(String[] args) {
		//11,22,33,44를 배열에 넣어서 
		//이중 33은 몇번째 위치에 있는지 프린트
		int[] num = {11,22,33,44};
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]==33) {
				System.out.println(i+1);
			}
		}
		
	}

}
