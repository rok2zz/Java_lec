package chap03;

public class ArtithmeticOperator {

	public static void main(String[] args) {
		int a=3;
		++a;
		System.out.println(a);
		
		int b=3;
		b++;
		System.out.println(b);
		
		System.out.println("===============");
		
		int a1=3;
		int b1=++a1;
		System.out.println(a1); //a1�� 4 �̸� +�����
		System.out.println(b1); // ++����� a1�� ����� �Ѵ� 4 
		
		int a2=3;
		int b2=a2++;
		System.out.println(a2); //b2=3 a2++ ��(������)
		System.out.println(b2); 
		
		System.out.println("===============");
		
		//��� ������
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2); //int�� �� ������
		System.out.println(8%5);
		
		System.out.println("2"+"3");
		
		//���� ������
		int value1=3;
		value1++;
		System.out.println(value1);
		
		int value2=3;
		value2++;
		System.out.println(value2);
		System.out.println();
		
		int value3=3;
		int value4= value3++;
		System.out.println(value3);
		System.out.println(value4);
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2+value7-- + ++value8; // ���ϱ� ���� ���� value7 ��ü�� -����
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("============");
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
	}

}
