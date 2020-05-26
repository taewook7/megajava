package 배열;

public class 값을알고있는경우 {
	int win=0;  // 전역변수  전체영역에서 쓸수있다고해서 Global 
	
	public static void main(String[] args) {
		//램에 변수가 생기는 시기: 선언할때! 
		//선언의 위치가 생존의 범위!! 
		//함수내의 지역에서만 생존할 수 있는 변수: 지역변수 
		//지역 = local
		
		String[] names = {"홍길순","홍도","화분"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		
		for (String x : names) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		char[] gender= {'김','이','도'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+ " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		int[] ages= {100,25,11};
	
		
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i]+" ");
			
		}
		System.out.println();
		
		for (int i : ages) {  // i=> int
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		double[] height= {187.3,154.2,140};
			for (int i = 0; i < height.length; i++) {
				System.out.print(height[i]+" ");
			}
		
		System.out.println();
		
		for (double d : height) {
			System.out.print(d+" ");
		}
		
		
		
		
	}

}
