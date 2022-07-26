
public class IntegralDemo {
	public static void main(String[] args) { // static 공용
		System.out.printf("255의 10진수 : %d\n", 255); // printf : 형식(formatting)에 맞게 출력, +가 아닌(,) 사용, %d : 10진수, \n : new line 줄바꿈
		System.out.println("255의 2진수 : " + Integer.toBinaryString(255)); // 2진수 변환 코드
		System.out.printf("255의 8진수 : %o%n", 255); // %o : 8진수, %n : 줄바꿈 (\n과 동일)
		System.out.printf("255의 16진수 : %x\n", 255); // %x : 16진수
		System.out.println("------------------------------------------");
		System.out.printf("0b01110000의 10진수 : %d\n", 0b01110000); // 0b : 2진수(binary)
		System.out.println("0b01110000의 2진수 : " + Integer.toBinaryString(0b01110000)); 
		System.out.printf("0b01110000의 8진수 : %o%n", 0b01110000); 
		System.out.printf("0b01110000의 16진수 : %x\n", 0b01110000);
		System.out.println("------------------------------------------");
		System.out.printf("056의 10진수 : %d\n", 056); // 숫자 앞에 0 : 8진수
		System.out.println("056의 2진수 : " + Integer.toBinaryString(056)); 
		System.out.printf("056의 8진수 : %o%n", 056); 
		System.out.printf("056의 16진수 : %x\n", 056);
		System.out.println("------------------------------------------");
		System.out.printf("0xAB의 10진수 : %d\n", 0xAB); // 0x : 16진수
		System.out.println("0xAB의 2진수 : " + Integer.toBinaryString(0xAB)); 
		System.out.printf("0xAB의 8진수 : %o%n", 0xAB); 
		System.out.printf("0xAB의 16진수 : %x", 0xAB);
		
	}
}
