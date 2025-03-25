package week04.homework;

import java.util.Scanner;

public class Work04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사칙연산 값 입력 받아 계산

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a값 입력: ");
		String stra=scanner.nextLine();
		int a = Integer.parseInt(stra);
		
		System.out.print("b값 입력: ");
		String strb=scanner.nextLine();
		int b = Integer.parseInt(strb);
		
		int v1=a*b;
		int v2=a/b;
		int v3=a-b;
		int v4=a+b;
		
		System.out.printf("%d\n", v1);
		System.out.printf("%d\n", v2);
		System.out.printf("%d\n", v3);
		System.out.printf("%d", v4);
	}

}
