package week04.homework;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//복리와 단리 이자 값을 입력받아서 계산ㄴ
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원금값 입력: ");
		String stra=scanner.nextLine();
		float v1 = Float.parseFloat(stra);
		
		System.out.print("연이율 입력: ");
		String strb=scanner.nextLine();
		float v2 = Float.parseFloat(strb);
		
		System.out.print("연이율 입력: ");
		String strc=scanner.nextLine();
		float v3 = Float.parseFloat(strc);
		
		float v4=v1*v2*(v3/12);//단리 계산
		System.out.printf("단리 이자: %.2f\n", v4);
		float v5=(float) (v1*Math.pow(1+v2,v3/12));
		System.out.printf("복리 이자: %.2f", v5);
	}

}
