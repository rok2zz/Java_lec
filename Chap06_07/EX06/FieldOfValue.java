package Chap06_07.EX06;

//p.jangwoo@gmail.com  

//��ü�� �ʵ忡 ���� �Ҵ� �ϴ� ��� : 3���� 
  //1. �ʵ忡 ���� ���� �ο� �ϴ� ��� 							<== ��ü�� ������
  //2. setter �� ���ؼ� ��ü�� �ʵ忡 ���� �ο�. ( ��Ʈ���� �ȴ�)      <== ��ü�� ������ 
  //3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� ( ��Ʈ�� �ȴ�) 			<== ��ü�� �����Ҷ� �ʱⰪ���� �ʵ忡 ���� �Ҵ� 

class Aa {  //1. ��ü ������ ���� �ʵ忡 �� �Ҵ�
	String name ;  // �̸� 
	int	age ; 		// ����
	String mail;    // ���� �ּ� 
	
	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Bb{	//2. setter�� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name ;  // �̸� 
	int	age ; 		// ����
	String mail;    // ���� �ּ� 

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}



	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Cc{	//3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name ;  // �̸� 
	int	age ; 		// ����
	String mail;    // ���� �ּ� 
	
	Cc(String name, int age, String mail) {   // �����ڿ��� �Ű����� 3���� �޾Ƽ� 
		this.name = name; 
		this.age = age;
		this.mail = mail;
	}
	
	void print() {
		System.out.println( "name : " + name + " age : " + age + " mail : " + mail);
	}
	
}


public class FieldOfValue {

	public static void main(String[] args) {

		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�. 
		Aa aa = new Aa();          //��ü�� ������ 
		aa.name = "ȫ�浿"; 
		aa.age = 30;
		aa.mail= "aaa@aaa.com";
		aa.print();
		
		
		//2. ��ü�� setter �� ����ؼ� �ʵ��� ���� �ο� 
		Bb bb = new Bb();			// ��ü�� ������ 
		bb.setName("������");
		bb.setAge(50);
		bb.setMail("bbb@bbb.com");
		bb.print();
		
		
		//3. �����ڸ� ����ؼ� �ʵ��� ���� �ο�. (��ü��  �����Ҷ� �ʵ��� ���� �ʱ�ȭ ) 
		Cc cc = new Cc("�������", 60, "ccc@ccc.com");        // ��ü�� �����Ҷ� �ʵ��� ���� �ο� 
		
		cc.print();
				
				
		

	}

}
