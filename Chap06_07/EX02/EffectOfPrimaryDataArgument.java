package Chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
	int abc; //�ʵ�
	
	
	static int twice(int a) { //������ �޾Ƽ� x2�ؼ� ��ȯ
		a = a*2;
		return a;
	}
	
	public static void main(String[] args) {
		int a=3; // �������� stack �� ������� ���� ����
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a); // ������ a�� ��ȭ x

	}

}
