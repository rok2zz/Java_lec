package chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//������ 
		boolean aBcD;	//�������� ù�ڴ� �ҹ��ڷ� ����, �ܾ ������ ��� ù�ܾ�� �빮�ڷ� 
		byte �����ٶ�;		//�������� �ѱ��� ������ �ִ�. (�������� ����)
		short _abcd; 	//������ Ư������ _�� ���
		char $ab_cd;	//������ $, _�� ����� �� �ִ�.
		//char ab cd;		//�����̳� �ٸ� Ư�����ڴ� ���� �� ����. 
		long abcd3;			// ������ ���ڸ� ���� �� �ִ�. �� ù��° �ܾ ���ڰ� ���� ���� �߻� 
		//long 3abcd;		// ù ���ڿ� ���ڰ� ���� ���� �߻�
		double main;	//
		// double class; 	//�ڹٿ��� ����ϴ� �������� ���� ������ ����� �� ����.
		int ABCD; 	//�������� �빮�ڷ� ��밡�� (�������� ����), ����� ������� ��ü �빮�ڷ� ���
		
		// ��� : ���� ���� �� �� ����.  final Ű���带 ��� �Ѵ�. , �빮�ڸ� ���. 
		final double PI;	
		final int MY_DATA;
		final float my_Data; 	// �������� �ʴ´�. 
		
		PI = 3.141957;
		
		System.out.println(PI);
		
		//PI = 123.4567;		//������� ���� ���Ҵ� �� �� ����. 
		
		abcd3 = 1234L;		//���� ������ Ÿ�� long ������ ���� �Ҵ� �Ҷ�, l, L�� ����� ��� �Ѵ�.
		System.out.println(abcd3);
		abcd3 = 56789l;		// ������ ���� ���Ҵ�. 
		System.out.println(abcd3);
		
		aBcD = true;	//aBcD�� true, false �� ���� �� �ִ�. 
		
		�����ٶ� = 127;		// byte : 1byte ( -128 ~ + 127 )	
		System.out.println(�����ٶ�);
		
		//�����ٶ� = 128;
		
		
		
	}
}
