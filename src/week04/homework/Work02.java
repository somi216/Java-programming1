package week04.homework;

public class Work02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//단리와 복리 계산 변수는 모두 소수2째자리까지로 선언하고, 계산 결과가 정수,소수
		//둘째자리까지 나오도록 한다
		
		float v1 = 20000f;//원금
		float v2 = 0.02f;//연이율
		float v3 = 30f;//기간(월단위-월수, 일단위-일수)
		
		float v4=v1*v2*(v3/12);//단리 계산
		System.out.printf("단리 이자: %.2f\n", v4);
		float v5=(float) (v1*Math.pow(1+v2,v3/12));
		System.out.printf("복리 이자: %.2f", v5);
		
		
	}

}
