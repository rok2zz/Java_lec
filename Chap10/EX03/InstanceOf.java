package Chap10.EX03;

//instanceof : ��ü ������ ĳ������ ���ɿ��θ� �� �� �ֵ��� ���ִ� Ű����
//��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� true,false�� ����
//�ٿ�ĳ���ý� ��Ÿ�� ���� �߻��� ������
class A{
	int m;
	void a() {
		System.out.println(m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		//1. intstanceof :
		A aa = new A();
		A ab = new B(); //��ĳ���� A�� ��밡��
		
		System.out.println(aa instanceof A );//true
		System.out.println(ab instanceof A ); //true
		System.out.println(aa instanceof B); //false
		
		if( aa instanceof B) { //aa��ü�� BŸ�� ������������
			B b = (B)aa; //�ٿ�ĳ����
			System.out.println("aa�� B�� ĳ���� �߽��ϴ�.");
		}
		else
			System.out.println("aa�� BŸ������ ĳ���� �Ұ�");
		
		if(ab instanceof B) {//ab��ü�� BŸ���� ������������
			B b = (B)ab;
			System.out.println("ab�� B�� ĳ���� �߽��ϴ�. ");
		}
		else
			System.out.println("ab�� BŸ������ ĳ���� �Ұ�");
		
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String Ŭ���� �Դϴ�. ");
		}
		else
			System.out.println("\"�ȳ�\"�� String Ŭ������ �ƴմϴ�. ");
	}

}
