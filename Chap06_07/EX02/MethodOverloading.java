package Chap06_07.EX02;

class B{
	 static String name = "BTS"; 	//static Ű�� �Ҵ��� �Ǹ�  ��ü �������� ȣ�� 
	
	 static void print () {			
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ� �Դϴ�. ");
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� :  �ϳ��� �޼ҵ�� �ް� ����Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� ( Java ) 
		//�޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ��� 

		//static : ��ü ���� ���� �ٷ� ȣ�� �ؼ� ��밡���ϵ��� �� �� �ִ� Ű���� 
			//��ü�̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��밡�� 
	
		System.out.println(B.name);  //��ü�̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print();					 //Ŭ���� �̸����� ȣ�� 
		
		System.out.println("===================");
		
		print1();		//static�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ�� ���� 
		print1(3); 		// �Ű������� 1���̰� ����Ÿ���� �޼ҵ带 ȣ�� 
		print1(30.8);	// �Ű������� 1���̰� double Ÿ���� �޼ҵ� ȣ�� 
		print1 ( 2, 5 );	//�Ű� ������ 2���̰� int, int Ÿ���� �޼ҵ� ȣ�� 
		
		
		
	}
	
	//�޼ҵ� �������̵� : �޼ҵ� �̸��� ���� , �Ű�����Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ带 ȣ��  
		// JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ����� �ش� �޼ҵ带 �۵� 
	
		//���� : ������ �Ű�����Ÿ�԰� ������ ������ ������ �߻� ��Ŵ 
	
	public  static void print1() {		//�޼ҵ� �̸� �տ� static : 
		System.out.println("�����Ͱ� �����ϴ�. ");
	}
	public static void print1 (int a) {
		System.out.println("���� : " + a);
	}
	public static void print1 (double a) {
		System.out.println("double : " + a);
	}
	 /*  �����߻� : ������ ������ Ÿ��, ������ ������ �޼ҵ尡 �����ϴ� ��� 
	public static void print1 (double k) {  //�Ű������� 1, ������ Ÿ���� double 
		System.out.println(k);
	}
	*/ 

	public static void print1 ( int a, int b) {
		System.out.println("a : " + a + " , "+ "b : " + b);
		
	}
	
	public static void print1 ( int c, double d) {
		System.out.println(c  + d );
	}
	

}
