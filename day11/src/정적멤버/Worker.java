package �������;

public class Worker {
	String name;
	String gender;
	int age;
	
	//����ƽ
	
	static int sumAge;
	static int count;
	

	
	public Worker(String name, String gender, int age) {
		count++;
		sumAge=sumAge+age;
		System.out.println("��ü�����Ǽ��� "+count);
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	
	//�ν��Ͻ� ������ ������ ���� ���� �� ���!
	//��ü ���� ��, �Ϲ� �޼ҵ�� ȣ���Ͽ� ����� �� �ִ�.
	//wk1.getName()
	
	public String getName() {
		return name;
	}
	
	//����ƽ ������ ������ ���� ���� �� ���! 
	//����ƽ => ��ü�������� �ʾƵ� Ŭ�����̸����� �ٷ� �����Ͽ� ��� ����!
	//Ŭ�����̸�.����ƽ����,Ŭ���� �̸�.����ƽ�޼��� 
	//������ Worker.getSumAge()
	public static int getSumAge() {
		return sumAge;
	}
	
	public static int getCount() {
		return count;
	}
	
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
}
