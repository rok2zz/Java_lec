package Chap06_07.EX06;

import Chap06_07.EX05.A;

public class Ex_A {

	public static void main(String[] args) {
		
		
		// �ٸ� ��Ű���� ��ü�� ����ϴ� ��� : 
		   // 1. ��ü Ŭ�����̸��� ����ϴ� ��� 
		Chap06_07.EX05.A a  = new Chap06_07.EX05.A() ;    //Ŭ������ ��ü�̸��� ��� : ��Ű����.Ŭ������ 
		
		//a.m = 10 ; // ���� �Ұ�  : default �� �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�. 
		a.k = 50 ;  //public : �ٸ� ��Ű���� Ŭ�������� ������ ���� 
		a.print2();  //public : 
		
		   // 2. import�� ����ؼ� ���� �ϴ� ��� 
		A aa = new A(); 		//import �� ����ϴ� ��� 
		aa.k  = 100;
		aa.print2();       // public : �ٸ� ��Ű���� Ŭ�������� ���� ���� 
		
		
		
	}

}
