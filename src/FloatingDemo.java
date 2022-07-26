
public class FloatingDemo {
	public static void main(String[] args) {
//		double avg = 0.08955556789;
//		System.out.println("avg = " + avg); // 원래 값
//		System.out.printf("avg = %f\n", avg); // %f 실수출력 (0이라도 소숫점6개를 다 찍음)
//		System.out.printf("avg = %.2f\n", avg); // %.2f 실수출력, 소수점 둘째 자리까지 (세번째 자리에서 반올림)
//		System.out.printf("avg = %e", avg); // %e 지수형 x.xxxxxxe	
		
		float f = 0.123456789123456789f;
		double d = 0.123456789123456789; // float 보다 더욱 정확하다.
		System.out.println("f = " + f);
		System.out.println("d = " + d);
	}
}
