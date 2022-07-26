import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String munja = sc.nextLine(); // 스트링"A" , 스트링을  캐릭터로
		
		char ch = munja.charAt(0); // index = 순서, 'A' 캐릭터
		System.out.printf("문자 %c 의 코드값은 %d입니다.", ch, (int)(ch));
	}
}
