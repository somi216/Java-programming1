package week04.homework;

public class Work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//소수점이 있는 변수를 3개를선언하고 소수 첫째, 둘째, 셋째 자리가 나오도록 하고
		//세수의 곱을 10자리에 소수점 3자리 로 나오게 하라.
		
		float a1 = 3.33f;
		float a2 = 2.78f;
		float a3 = 4.85f;
		
		System.out.printf("%.1f\n", a1);
		System.out.printf("%.2f\n", a2);
		System.out.printf("%.3f", a3);
		
		System.out.println();
		
		float a4 = a1*a2*a3;
		System.out.printf("%10.3f",a4);
		

	}

}
