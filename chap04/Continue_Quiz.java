package chap04;

public class Continue_Quiz {

	public static void main(String[] args) {
		// 1. continue �� ����ؼ� 1 ~ 19�� ����ϴµ� Ȧ���ܸ� ���
		
		POS:for(int i=1; i<=19;i++) {
			for(int j=1;j<=19;j++) {
				if((i%2)==0) {
					continue POS;
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		for(int i=1; i<=19;i++) {
			if((i%2)==0) {
				continue;
			}
			for(int j=1;j<=19;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		System.out.println("============================");
		
		// 2. continue �� ����ؼ� 1 ~ 19�� ����ϴµ� 3�� ����� ���
		
		POS:for(int i=1; i<=19;i++) {
			for(int j=1;j<=19;j++) {
				if((i%3)!=0) {
					continue POS;
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		for(int i=1; i<=19;i++) {
			if((i%3)!=0) {
				continue;
			}
			for(int j=1;j<=19;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
