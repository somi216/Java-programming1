package week04.homework;

import java.util.Scanner;

public class Work06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//삼각형 사각형 넓이 입력 받아 계산
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a값 입력: ");
		String stra=scanner.nextLine();
		int a = Integer.parseInt(stra);
		
		System.out.print("b값 입력: ");
		String strb=scanner.nextLine();
		int b = Integer.parseInt(strb);
		
		int v1 = a*b;
		float v2 = a*b/2;
		
		System.out.printf("삼각형 넓이: %d\n 사각형넓이: %f",v1,v2);
	}

}
