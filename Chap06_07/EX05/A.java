package Chap06_07.EX05;

	//���� ������( ����ȭ : �����͸� �ܺη� ���� ��ȣ)  : 
		// public , protected, default (�����ؼ� ���), private 
		//Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ�  <<== ���� �����ڰ� �ݵ�� �Ҵ��� �Ǿ��ֽ��ϴ�. 
		//Ŭ���� �̸� : public, default 

public class A {
	
	 int  m = 3; 		//�ʵ��� �⺻ ���� �����ڴ� default : ������ ,  
	 int  n = 4;		    // default  : ���� ��Ű�� ���� �ٸ� Ŭ�������� ������ ���� 
	 								//�ٸ� ��Ű���� Ŭ���������� ���� �Ұ�. 
	 
	 public int k = 10; 	//public : �ٸ� ��Ű������ ������ ���� 
	 
	
							//	private : �ܺ� Ŭ�������� ������ �Ұ� 
	
	void print () { 		//default : ���� ��Ű������ Ŭ���������� ��� ���� 
		System.out.println("����Ʈ ���� "  + m + " , " + n );
	}
	
	public void print2 () { 
		System.out.println("�ܺ� ��Ű�� �ٸ� Ŭ�������� ���� ���� " + k);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
