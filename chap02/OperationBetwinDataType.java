package chap02;

public class OperationBetwinDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1  = 3+5;// int + int = int
		int value2 = 8/5;
		float value3 = 3.0f +5.0f; //
		double value4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		
		int value5 = data1+data2;//int ���� ���� �ڷ����� �������� int ������ ��ȯ
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		// �ٸ� �ڷ��� ���� ����
		double value6 = 5+3.5; //int+double >> double��
		int value66 = (int)(5+3.5); // �������� �ص���
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		
		int value9 = data3+data4;
		// short value99 = data3+data4; �������߻�. int �����ι޾ƾ���
		double value10 = data3+data4;
		
		System.out.println(value66);
		System.out.println(value6);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);		
		

	}

}
