package chap03;

public class OperatorEx4 {

	public static void main(String[] args) {
		/* ���� ������ : = �� �����ϴ� ����������, >>=, <<=, >>>= ��
		 * a=b; : b�� ���� a�� �Ҵ�
		 * a +=b : a= a+b 
		 * a &=b : a= a&b
		 * a |=b : a|b
		 * a <<=b : a= a<<b
		*/
		int value1=3;
		value1 = value1+3;
		System.out.println(value1);
		System.out.println();
		
		int value2; // �⺻�� �ڷ����� �������� ���� ���� ��� �⺻�� 0 �Ҵ�
					// ������ �ڷ����� ��� �⺻�� null
		value2 = 5;
		System.out.println(value2+=2);
		System.out.println(value2-=2);
		System.out.println(value2/=2);
		value2=5;
		System.out.println(value2%=2); // 2�γ��� ��������
		value2=5;
		System.out.println(value2|2); //2�������ο���
		value2=5;
		System.out.println(value2&2);
		value2=5;
		
		System.out.println(value2 <<=2);
		value2=5;
		System.out.println(value2 >>=2);
		value2=5;
		System.out.println(value2 >>>=2); 
	}

}
