package Chap10.EX02;

class Aa{
	int m;
	void abc() {
		
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		
	}
}
public class Inheritance_1 {

	public static void main(String[] args) {
		//Ÿ��ĳ������ �������� ���
		Bb b = new Bb();
		b.m = 10; // Aa�� �ʵ�
		b.n = 20; // Bb�� �ʵ�
		b.abc();
		b.bcd();
		
		// ��ĳ���� : �ڽ� >> �θ�
		Aa a = new Bb(); 
		a.m = 100;
		//a.n = 200; ���ٺҰ�
		
		Bb bb6 = (Bb) a;//�ٿ�ĳ����
		bb6.m = 100;
		bb6.n = 200;

	}

}
