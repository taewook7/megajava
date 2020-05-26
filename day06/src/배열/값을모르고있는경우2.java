package 배열;

public class 값을모르고있는경우2 {

	public static void main(String[] args) {
		String[] names= new String[21];
		names[1]="김태욱";
		names[2]="김김김";
		names[5]="미원";
		names[8]="중화원";
		names[13]="안길동";
		names[19]="이소운";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		
		
	}

}
