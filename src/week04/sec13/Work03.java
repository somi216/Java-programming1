package week04.sec13;

import java.util.Scanner;

public class Work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열로 정수를 넣으시요: ");
		String input = scanner.nextLine();
		
		int parsedInt = Integer.parseInt(input);
		
		System.out.print("또 다른 정수를 넣으시요: ");
		int userInputInt = scanner.nextInt();
		
		System.out.println("문자열 정수: "+parsedInt);
		System.out.println("사용자 입력으로부터 정수 : "+userInputInt);
		
		scanner.close();
	}

}
