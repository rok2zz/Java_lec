package chap04;
public class IF_Ex01 {
	public static void main(String[] args) {

		//if �� : 
		/*
		 * if (����) {
		 *    ������ ���϶� ����� �ڵ� ;
		 * }
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("����1 : ������ ���϶� ���� ");
		}
		
		/*
		 * if (����) {
		 *     ������ ���϶� ������ ����;
		 * } else {
		 * 	   ������ �����϶� ������ ����;
		 * } 
		 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("����3");			// ������ True �϶� ����
		}else {
			System.out.println("���� 4");			//������ false �϶� ���� 
		}
		
		if (bool2) {
			System.out.println("����5");			// ������ True �϶� ����
		}else {
			System.out.println("���� 6");			//������ false �϶� ���� 
		}
		System.out.println("====================");
		
		//if ~ else �� ���� �����ڷ� ��ȯ�� ���� 
		
		System.out.println( (bool1) ? "����7" : "����8"   );  // ���̹Ƿ� "����7"�� ���
		System.out.println( (bool2) ? "����7" : "����8"   );  // �����̹Ƿ� "����8"�� ���
		
		/*
		 * if�� ������ ���� ���϶� ? 
		 * 
		 * if (����1) {
		 * 		����1�� ���϶� ���� �ڵ�;
		 * } else if (����2) {
		 * 	     ����2�̰� ���϶� ���� �ڵ�;
		 * } else if (����3) {
		 * 		 ����3 �� ���϶� ���� �ڵ� ;
		 * } else {
		 * 		���� ������ ��� ���� ���� ������ ������ �ڵ� ;
		 * }
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A ���� , ���� : " + value3);
		}else if ( value3 >= 80) {
			System.out.println("B ���� , ���� : " + value3);		//�����Ŀ� if ���� ���� ���´�. 
		}else if (value3 >=70 ) {
			System.out.println("C ���� , ���� : " + value3);
		}else {
			System.out.println("F ����, ���� : " + value3);
		}
		
		/* 
		 * IF ������ ������ ������ �ٲ�� ���� ��� 
		 */
		value3 = 85;
		if (value3 >= 90) {
			System.out.println("A ���� , ���� : " + value3);
		}else if ( value3 >= 70) {
			System.out.println("C ���� , ���� : " + value3);		//�����Ŀ� if ���� ���� ���´�. 
		}else if (value3 >=80 ) {
			System.out.println("B ���� , ���� : " + value3);
		}else {
			System.out.println("F ����, ���� : " + value3);
		}
		System.out.println("=========================");
		
		/*
		 *  ������ �ο� �Ҷ� ���� �ϰ� ���� 
		 *  
		 */
		value3= 75;
		if ( value3 <=100 && value3 >= 90) {
			System.out.println("A ����");
		}else if ( value3 < 80 && value3 >= 70) {
			System.out.println("C ����");
		}else if ( value3 < 90 && value3 >= 80) {
			System.out.println("B ����");
		}else {
			System.out.println("F����");
		}
		
		/*
		 * if ������ ���๮�� �ϳ��϶� �� {} �� ���� �� �� �ִ�. 
		 */
		
		System.out.println("=================================");
		
		if ( 3 < 5) 
			System.out.println("�ȳ��ϼ���");		// if���� {} �� ������ ��� 
		
		System.out.println("=====================");
		
		if (3 > 5)
			System.out.println("�ȳ��ϼ��� 2");
		System.out.println("�ݰ����ϴ�. ");
		
		
	}

}
