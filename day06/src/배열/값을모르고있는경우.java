package 배열;

public class 값을모르고있는경우 {

	public static void main(String[] args) {
	int[] num=new int[1000];   // 복사할때쓰는 new 
	System.out.println(num);   // num의 주소값이 찍힌다. [I@21bcffb5
	System.out.println(num[0]); //배열은 무조건 대괄호이다. 위치값을을 영어로 index 라고함.
	System.out.println(num[999]);
	num[500] =1;
	num[666] =1;
	
	int[] seat =new int[21];
	//읽기전용변수: 배열의 개수가 자동으로 들어감 
	System.out.println(seat.length);
	System.out.println(seat[0]==seat[2]); // 기본연산자이므로 비교연산자 써도됨.
//	System.out.println(seat == seat[0]);  
	seat[2]=1;
	seat[3]=1;
	seat[4]=1;
	seat[5]=1;
	
	//for문 내에서의 i는 배열에서 index역할 
	//i => index 의 줄임말.
	for (int i = 0; i < seat.length; i++) {
		System.out.print(seat[i]+" ");  // 어디가 앉아있고 안앉아있고를 파악가능
		
	}
	
	
	//배열은 초기값이 다들어있다. int=0 double= 0.0. 
	//	int num2=0;
//	System.out.println(num2);
		
		
		
	}

}
