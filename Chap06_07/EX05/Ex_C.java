package Chap06_07.EX05;

public class Ex_C {

	public static void main(String[] args) {

		
		// ���� Ŭ������ ������.  
		
		C c = new C(); 	//���� ��Ű���� �����ϴ� Ŭ���� 
		
		
		//�ʵ忡 ���� ���� �Ҵ� 
		
		// c.company = "�Ｚ�ڵ���";  //private : �ܺ� Ŭ�������� ���� �Ұ� 
		c.model = "�׷���"; 		//default 
		c.color = "����";			//protected
		c.maxSpeed = 250; 		//public 
		
		c.print();			//public 
		

	}

}
