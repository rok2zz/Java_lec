package Ex;
public class Ex09_1 {
	public static void main(String[] args) {
		/*
		 [���� 9] ������ 10 �� �����ϴ� �迭�� ����� 1 ���� 10 ���� ������ ������ ��
		���ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		
		
		������ ������ : 3 6 3 6 1 3 8 9 6 9 
		����� 5.4
		[Hint] 1 ���� 10 ���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
		int i = (int)(Math.random()*10+1);
		 */
		
		int[] num = new int[10];
		int sum = 0;
		double avg = 0; 	//��� = ��ü���� ���ؼ� ( sum ) / ���� ����
							// ����� ��� �Ҷ��� �ݵ�� double ������ ����
		
		System.out.println("������ ������ : ");
		
		//�迭�� �� �濡 ������ ���� �߻����Ѽ� �Է� : ������ �� (1 ~ 10)
		for ( int i =0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random() * 10 + 1);	// num[0] ~ num[9]���濡 ���� : 1~ 10 
			System.out.print( num[i] + " ");
		}
		System.out.println();
		
		// ��հ� : �迭�� �� ���� ������ ���� ���ؼ� ��ü ���� ������ ������.
		
		for ( int i =0 ; i < num.length ; i++) {
			sum += num[i]; 	// sum = sum + num[i];
		}
		avg =  (double) sum / num.length;	//  ��� = �� / ���� ���� 
		System.out.println("����� : " + avg);
		System.out.println("���� : " + sum);
		System.out.println("���� ������ : " + num.length);
		
		
		
		

	}

}
