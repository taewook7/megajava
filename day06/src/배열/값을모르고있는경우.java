package �迭;

public class �����𸣰��ִ°�� {

	public static void main(String[] args) {
	int[] num=new int[1000];   // �����Ҷ����� new 
	System.out.println(num);   // num�� �ּҰ��� ������. [I@21bcffb5
	System.out.println(num[0]); //�迭�� ������ ���ȣ�̴�. ��ġ������ ����� index �����.
	System.out.println(num[999]);
	num[500] =1;
	num[666] =1;
	
	int[] seat =new int[21];
	//�б����뺯��: �迭�� ������ �ڵ����� �� 
	System.out.println(seat.length);
	System.out.println(seat[0]==seat[2]); // �⺻�������̹Ƿ� �񱳿����� �ᵵ��.
//	System.out.println(seat == seat[0]);  
	seat[2]=1;
	seat[3]=1;
	seat[4]=1;
	seat[5]=1;
	
	//for�� �������� i�� �迭���� index���� 
	//i => index �� ���Ӹ�.
	for (int i = 0; i < seat.length; i++) {
		System.out.print(seat[i]+" ");  // ��� �ɾ��ְ� �Ⱦɾ��ְ� �ľǰ���
		
	}
	
	
	//�迭�� �ʱⰪ�� �ٵ���ִ�. int=0 double= 0.0. 
	//	int num2=0;
//	System.out.println(num2);
		
		
		
	}

}
