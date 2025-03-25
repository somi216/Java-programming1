package week03.homework;

public class work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double var1 = 30000000;//원금
		double var2 = 2;//이자율
		double var3 = 30;//기간
		
		double var4 = var1*(1+var2*var3);
		double var5 = var1*Math.pow(1+var2, var3);
		
		System.out.println("단리: "+var4);
		System.out.println("복리: "+var5);
	}

}
