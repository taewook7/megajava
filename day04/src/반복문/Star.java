package 반복문;

public class Star {

	public static void main(String[] args) {
		
		// 이중 for문 
		for (int i = 0; i <3; i++) { // 별3줄
			//별한줄 
			for (int j= 0; j <7; j++) {
				System.out.print("★" + " ");	
			}			
			System.out.println();
		}
	}

}
