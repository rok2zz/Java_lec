package Chap06_07.EX01;

class Aaa {
	String	name ;		//�ʵ� : ��üȭ ���Ѿ� ��� ����, Ŭ���� ������� ���� 
	int age ;				//�ʵ��� ������ Heap ������ ����, Heap ������ ������ ������ ���� �ʱ�ȭ
	double weight;
	String email;			//�ʵ�� ���� �ǰ� ���� �Ҵ��� ���� �ʴ� ��� : 
	boolean man; 			// �������� : Null, int : 0 , double : 0.0 , boolean ; false
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	

	
	
	
	
}

public class CreateObject_02 {

	public static void main(String[] args) {
		
		Aaa aaa = new Aaa();	//��ü ���� (aa)  
		
		//�ʵ��� �ʱ� ���� ��� (Heap ������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("====================");
		
		//������ ���� ���� ���� [Heap] , ���Ȼ� �޸𸮿� ���� ���� �״����� �ʴ´�. ĸ��ȭ 
		aaa.name = "ȫ�浿";
		aaa.age = 30;
		aaa.weight = 70.5; 
		aaa.man = true;
		aaa.email = "aaa@aaa.com"; 
		
		//������ ���� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("=================");
		
		//setter �޼ҵ带 ���ؼ� ���� ���� , �޸𸮿� ���� ������ ��� �Ҽ� �ִ�.
			//���������ϴ� ���� (1�� ~ 12��) 
		aaa.setName("�������");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		//getter �޼ҵ带 ���ؼ� �޸��� ���� ��� 
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���. 
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa(); 
		
		
		
		

	}

}
