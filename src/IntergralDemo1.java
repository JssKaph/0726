
public class IntergralDemo1 {
	public static void main(String[] args) {
		short age = 26; //  26은 4byte 이지만 2진수로 바꿨을때 1byte 이므로 가능 (앞에 의미없는 0들을 짤라냄) 
		byte a = 5;
		byte b = 9;
		byte sum = (byte)(a + b); // 자바는 2합 연산일 때는 무조건 int가 된다 or int sum = a + b;
		long money = 10_000_000_000L; // L : 100억은 int의 22억을 넘어가기 때문에 Long표시(8byte), _(underbar : 숫자에 상관없이 사용가능)
	}
}
