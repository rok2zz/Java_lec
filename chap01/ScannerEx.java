package chap01;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ÿ��θ� ��ĭ���� �и��Ͽ� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //���ڿ��� ��ǲ�޵��� ��
		System.out.println("�̸��� " + name + ", ");
		
		String city = scanner.next(); 
		System.out.println("���ô� " + city + ", ");
		
		int age = scanner.nextInt();  // �������� ��ǲ�޾Ƽ� �о� ���� 
		System.out.println("���̴� " + age + ", ");
		
		double weight = scanner.nextDouble();		//�Ǽ� ���� ��ǲ �޾Ƽ� �о����
		System.out.println("ü���� " + weight + ", ");
		
		boolean single = scanner.nextBoolean(); 	// ������ �о� ���� (true , false)
		System.out.println("���� ���δ� " + single + "�Դϴ�. ");
		scanner.close();
	}
}
