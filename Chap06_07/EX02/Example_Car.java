package Chap06_07.EX02;


public class Example_Car {

	public static void main(String[] args) {
		// Car Class �� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ� �ؼ� ��� �غ�����. 
		
		Car sonata = new Car();   //��üȭ ,  
		Car grandeur = new Car();
		
		// �� ������ ���� �Ҵ��ϰ� ����� ������. (�޸𸮸� ���� ���, settor�� ���ؼ� ���� �Ҵ�)
		 
		//������ ���� ���� �Ҵ�  , ���� ������ �ƴϴ�. �޸𸮿� ������ �ʴ� ���� ���� �״�. 
		//private ������ : ĸ��ȭ , ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�. 
		//setter �� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ���� �Ҽ� �ִ�. 
		sonata.company = "����";   
		sonata.model = "�ҳ�Ÿ";
		sonata.maxSpeed = 200; 	//  -, 700 �� �̻��� ������ ������ ���� 
		
		// ==============================================================
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		
		// =======================================================
		
		// setter �� ���ؼ� ���� �Ҵ� : RAM�� ���� �ο� �Ҷ� ���
		grandeur.setCompany("����");
		grandeur.setColor("����");
		grandeur.setMaxSpeed(300);
		grandeur.setModel("�׷���");
		
		//getter �� �޸��� ���� ��� �Ҷ�.
		System.out.println( grandeur.getColor());
		System.out.println(grandeur.getModel());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//p.jangwoo@gmail.com 
		
		//[����]  : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ��� ..... >> 

		
		
		
	}

}
