package Ex;
public class Ex04 {
	public static void main(String[] args) {
		int lineCount;	//���� �������� ���� ����
		int starCount;  //���� ��� �ϴ� ����
		
		for ( lineCount = 0 ; lineCount < 4 ; lineCount++) {
			for (starCount = 0 ; starCount <= lineCount ; starCount++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
