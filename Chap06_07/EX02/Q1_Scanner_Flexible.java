package Chap06_07.EX02;
import java.util.Scanner;

public class Q1_Scanner_Flexible {
	
	static void sum(int...values) {
		int sum = 0;;
		for(int i=0;i<values.length;i++)
			sum+=values[i];
		System.out.println("�Է��� ������ �� : " + sum);
		System.out.println("�Է��� ������ ��� : " + (double)sum/values.length);
	}
	
	public static void main(String[] args) {
		// ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���.");
		int count = sc.nextInt();
		int[] array = new int[count];
		System.out.println("������ �Է��ϼ���.");
		for(int i=0;i<count;i++)
			array[i] = sc.nextInt();
		
		sum(array);
		
		
		
		sc.close();
	}

}
