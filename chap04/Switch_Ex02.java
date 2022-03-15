package chap04;
public class Switch_Ex02 {
	public static void main(String[] args) {
		
		//1.  Switch ������ Break�� ó�� ���� �ʾ����� : �ش� case �� �̵����� ������ case ���� ��� �����Ѵ�. 
		
		int value1 = 2;
		
		switch (value1) {
		case 1:
			System.out.println("A ����");
		case 2:
			System.out.println("B ����");
		case 3:
			System.out.println("C ����");
		default :
			System.out.println("F����");
		}
		
		
		System.out.println("=================================");
		
		
		// 2. break �� ���ԵȰ�� 
		
		int value2 = 3;
		
		switch (value2) {
		case 1:
			System.out.println("A ����");
			break;
		case 2:
			System.out.println("B ����");
			break;
		case 3:
			System.out.println("C ����");
			break;
		default :
			System.out.println("F����");		//switch �� ������ case �� break�� ���� ����
		}
		
		System.out.println("======================");
		value2 = 2;
		
		if ( value2 == 1 ) {
			System.out.println("A ����(if)");
		} else if (value2 == 2) {
			System.out.println("B ����(if)");
		} else if (value2 == 3) {
			System.out.println("C ����(if)");
		} else {
			System.out.println("F ����(if)");
		}
		
		/*
		 * switch �� ����ؼ� ������ 7�� �̻��� pass, 7�� ���ϴ� fail �� ��� ( ���� : 1 ~ 10)
		 */
		
		int a = 5; 
		
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
		}
		
		
		
		
	}
}
