package Ex;
public class Ex11 {
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
		//String �� ���� �Ҵ� �Ҷ� �����ڸ� ���ؼ� �Ҵ�. // ������ �޸� ������ ������. 
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);
		System.out.println(bb);
		
		// �⺻ �ڷ����϶� : ==   (���� ��)
		// ���� �ڷ����϶� : ==   ( �����ϴ� �ּ��� ������ ��)
		// ���� �ڷ����϶� ���� �� : str1.equals(str2)  <== �������� str1 ���� str2�� �� �ִ� ���� ��. 
		
		if ( aa == bb) { 				//�޸��� �ּ� ���� �� ( aa , bb�� �ٸ� �޸� �ּҸ� ���´�. 
			System.out.println(true);
		} else {
			System.out.println(false);		// false ��� ( ����Ű�� �ּҰ��� �ٸ���. 
		}
		System.out.println("=================");
		
		if ( aa.equals(bb)) {			// �޸��� ���� ���Ҷ�  aa.equals(bb) 
			System.out.println(true);	// true �� ��� ( ���� �� ) 
		} else {
			System.out.println(false);
		}
		
		System.out.println("=====================");
		System.out.println("======================");
				
		// String �� ���� ���ͷ� ���� �ٷ� �Ҵ�. //�޸� ������ ���� �Ѵ�.  
		
		String a = "�ȳ�";  
		String b = "�ȳ�"; 
		
		if ( a==b ) {					//���� �ڷ������� "==" : �޸��� �ּҸ� ��  
			System.out.println(true);   // true 
		} else {
			System.out.println(false);
		}
		
		
		
		
		
	}
}
