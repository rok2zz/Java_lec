package Chap06_07.EX06;

import Chap06_07.EX05.Bb;  //�ٸ� ��Ű���� Ŭ�������� Ŭ������ ȣ�� �Ҷ� public ���� �����ڰ� �ο� �Ǿ� �־���Ѵ�. 

// import Chap06_07.EX05.B;      //class B�� Ŭ���� ���� �����ڰ� default �̱� ������ �ٸ� ��Ű������ ���� �Ұ�. 


public class ExternalClass_2 {

	public static void main(String[] args) {
		
		//B b = new B(); 
		
		// �ٸ� ��Ű���� Ŭ�������� BbŬ������ ���� �ϴ� ��� 
		
			// 1. import �� ���� ���. 
			// 2. Bb Ŭ������ Ŭ���� ���� �����ڴ� public 
			// 3. �ʵ�, �޼ҵ� �� ���� �����ڿ� ���� ������ ���� ( protected (��Ӱ���) , public) , �Ұ���(private, default)  
		
		Bb bb = new Bb(); 	//�ٸ� ��Ű���� Ŭ���� : 1. Ŭ���� ���� �����ڿ� public 
		
		//<< �ʵ� ���� >>
		//bb.a = 10;   //private : ���� Ŭ���� �������� ����
		//bb.b = 20;   //default : ���� ��Ű�� ������ ���� ����
		//bb.c = 30;   //protected : default ���� + �ٸ� ��Ű������ ���ٰ��� (��Ӱ���)
		bb.d = 40;   //public : protected + �ٸ� ��Ű������ ���ٰ���
		
		//<<�޼ҵ� ����>> 
		// bb.print1();	//private 
		// bb.print2();	//default
		// bb.print3();	//protected   �ܺ��� �ٸ� ��Ű������ ���� �ҷ��� ��� ���谡 �ʿ�. 
		bb.print4();   // public 
		
		
		

	}

}
