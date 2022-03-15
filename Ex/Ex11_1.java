package Ex;

import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		/*
		 [���� 11] ���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2 ���� �迭�� �ۼ��϶�.
			
			String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
			int score[] = {95, 88, 76, 62, 55};
			�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� ��
			���϶�. "�׸�"�� �Է¹����� �����Ѵ�. 
			
			(Java �� �ε��� 0 �� �����Ƿ� score[0]�� ���)
			
			���� �̸� >> Jaba
			���� �����Դϴ�.
			���� �̸� >> Java
			Java �� ������ 95
			���� �̸� >> �ȵ���̵�
			�ȵ���̵��� ������ 55
			���� �̸� >> �׸�
			
			
			[Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ�
			�Ѵ�.
			String name;
			if(course[i].equals(name)) {
			 int n = score[i];
			 ...
			}
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};
		
		String name = null ; 	//��ĳ�ʷ� ������ ���ڿ��� �޴� ���� 
		int i = 0 ; 		//���ȣ�� ��� ���� 
		
		System.out.println("���α׷��� ���� �ҷ��� \"�׸�\" �� �Է� �ϼ���. ");
		
		 while ( true ) {	//Ư�� ������ ���� �Ҷ� ���� ��� ���� ���ư�. 
			 System.out.println("���� �̸� >>> ");
			 name = sc.next();      //��ĳ�ʷ� ���� �̸��� �޾Ƽ� ���� name �� �Ҵ�. 
			 
			 if (name.equals("�׸�")) {  //���� : name�� �������� �̹Ƿ� == �� ������� �ʰ� equals 
				 break;
			 }
			 
			 // course �� ������ ���鼭 ��ĳ�ʷ� ���� name ������ ���� ������ 
			 for (i = 0 ; i < course.length ; i++) {
				 if ( course[i].equals(name)) {
					 System.out.println(course[i] + "������ : " + score[i]);
					 break;
				 }
				 
				// ������ ����� �������� �˻��� �ȵ� ��� ?  
				 if (i == course.length -1) {		// i ������ ������ ����� ������ �˻��� �ȵ� ��� 
					 System.out.println("���� ���� �Դϴ�. ");
				 }
				 
			 }
			 
			 
			 
			 
		 }
		
		 sc.close();
		 System.out.println("���α׷��� ���� �մϴ�. ");

	}

}
