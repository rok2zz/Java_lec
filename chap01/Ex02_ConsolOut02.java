package chap01;

public class Ex02_ConsolOut02 {

	public static void main(String[] args) {
		System.out.printf("���� ���̴� %d�Դϴ�. \n",30); // %d �ڸ��� ����, printf : �������
		System.out.printf("%o\n",10); //%o : 8����
		System.out.printf("%x\n", 30);//%x:16����
		System.out.printf("%s\n","���"); // %s : ���ڿ�
		System.out.printf("%f\n",5.876534); //%f : �Ǽ�
		System.out.printf("%4.2f\n",5.8); //%4.2f : ��ü 4�ڸ�, �Ҽ��� ���� 2�ڸ�
		System.out.printf("%d �� %4.2f",10,5.8);
	}

}
