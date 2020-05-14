package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		//산술연산자 (사칙연산자 + 나머지연산자) 
		System.out.println("더한값은"+(num1+num2));
		System.out.println("뺀값은"+(num1-num2));       //오류가 뜨는이유? 괄호로 num1,num2 연산을먼저하게해줘야함.  
		System.out.println("곱한값은"+(num1*num2));  //곱하기가 먼저 연산되므로 괄호안해줘도됨 그러나 명료한코드가좋은코드이므로 모든곳에 괄호해줘라
		System.out.println("나눈값은"+(num1/num2));
		System.out.println("나머지는"+(num1%num2));  // 나머지를 구하는연산자 % 
	}

}
