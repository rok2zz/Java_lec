package Ex;

import java.util.Scanner;

public class Q_������ {

	public static void main(String[] args) {
	
			Scanner ed = new Scanner(System.in);
			System.out.println("������ ��� �̸��� �ְ� �ش� � ������(���)�� ��������");

			int sum = 0;

			while(true) {
			System.out.println();
			System.out.println("��� >>");
			String sports = ed.nextLine();
			String[] array1 = sports.split(" ");
			if(sports.equals("�׸�")) {
			break;
			}

			for(int i = 0; i < array1.length; i+=2) {
				
				if ( i < array1.length -1)	{		
					System.out.printf("%s : %s�� , ",array1[i], array1[i+1]);
				} else 
				{
					System.out.printf("%s : %s�� ",array1[i], array1[i+1]);}
				}
			
				for(int i = 0; i < array1.length; i++) {
					if(i%2 == 1) {
					sum = sum + Integer.parseInt(array1[i]);
				}
			}
			System.out.println();
			System.out.println("������� ������ �� �հ� : " + sum);

			int a = array1.length;
			int b = a/2;
			System.out.println("������� ��� ������ �� : " + (sum/b));


			}
			ed.close();
			System.out.println("���α׷��� �����մϴ�.");

	}}


