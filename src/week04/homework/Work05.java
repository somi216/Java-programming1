package week04.homework;

import java.util.Scanner;

public class Work05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//원의 둘레 넓이 부피 값 입력 받아 계산
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름 값 입력: ");
		String stra=scanner.nextLine();
		int a = Integer.parseInt(stra);
		
		float v1 = (float) (2*a*3.14);
		float v2 = (float) (a*a*3.14);
		float v3 = (float) (a*a*a*3.14);
		
		System.out.printf("원의 둘레: %f\n 원의 넓이: %f\n 원의 부피: %f",v1,v2,v3);
		
		
	}

}
