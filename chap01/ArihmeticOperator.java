package chap01;
import java.util.Scanner;
public class ArihmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� �ϼ���");
		
		int time = sc.nextInt();  // ��ĳ�ʿ��� ��ǲ���� �޾Ƽ� time ������ �Ҵ�
		int scond = time % 60 ; // % : ���� ������ ��,  ��. 
		int minite = (time / 60) %60 ; // ��
		int hour = (time / 60) / 60 ; // �ð� 
		
		System.out.println(time + "  �ʴ� " );
		System.out.println(hour + "�ð�, ");
		System.out.println(minite + "��, ");
		System.out.println(scond + "�� �Դϴ�. ");	
	}
}
