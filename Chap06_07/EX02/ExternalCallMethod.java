package Chap06_07.EX02;

//�޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű������� Ÿ�԰� ������ ���� ���� �ٸ��� ȣ��� (Java)
//�޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ���
// import Chap06_07.EX03.A; // �ٸ� ��Ű���� ������� ����Ʈ
// �پ��� Ÿ���� �޼ҵ� ����(���� Ÿ���� �ִ� ��� : int, double ��)
// ���� Ÿ�� x : voidŰ�� ���

public class ExternalCallMethod {

	public static void main(String[] args) {
		//��ü ����
		A a = new A(); //���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��밡��
		
		//�޼ҵ� ȣ��
		a.print();
		int k = a.data();
		System.out.println(k);
		
		double result = a.sum(3,5.2);
		System.out.println(result);
		
		a.printMethod(5);
		a.printMethod(25);
		
		//���� :
		
		System.out.println(a.data());// ��±����� ȣ�� ������ �޼ҵ�( ������ ����)
//		System.out.println(a.print()); ���� �߻�
		a.print();
		System.out.println(a.sum(4, 10.5));
//		System.out.println(a.printMethod(3)); ����
		a.printMethod(3);
	}

}
