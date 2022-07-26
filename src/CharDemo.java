
public class CharDemo {
	public static void main(String[] args) {
//		char grade = 'B'; // 한개의 글자만 쓸 수 있다 "AB" 안됨
//		System.out.println("grade = " + grade);
//		char ch = '\n'; // 	탈출 문자 \n등 다양하게 사용가능
//		System.out.println("ch = " + ch);
//		ch = 'C';
//		System.out.println("ch= " +ch);
		
//		System.out.printf("%c", 65); // 65를 char 로 찍음 A
//		System.out.printf("%c", 65+1); // B
//		System.out.printf("%c", '\n');
//		char ch ='C';
//		System.out.printf("%c", ch); // C
//		System.out.printf("%c", ch+1); // D
//		System.out.printf("%c", '\b'); // 백스페이스
//		System.out.printf("%c", 'E'); // D를 지우고 E를 덮음
		
		char ch = '\uCAFE'; // 유니코드
		System.out.println("ch = " + ch);
	}
}
