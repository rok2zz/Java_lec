package chap04;

import java.util.Scanner;

public class If_Ex02 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int num1 = 10 ; 
		int num2 = 2;
		char operator = '+' ;		
		int result = 0; 		
		if ( operator == '+') {
			result = num1 + num2;
		}else if ( operator == '-') {
			result = num1 - num2;
		}else if ( operator == '*') {
			result = num1 * num2;
		}else if ( operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("������ ���� �Դϴ�. ");
			sc.close();
			return;
		}		
		System.out.println( "��� ���� :" + result + " �Դϴ�. ");	
		sc.close();
	}
}
