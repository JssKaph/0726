import java.util.Scanner; // 자바 > 유틸 > 스캐너 사용, import 하나가 생략

public class StudentInfo {
	public static void main(String[] args) {  // 프로그램의 시작과 끝, 메인이 없다면 스스로 실행 시킬 수 없음
		Scanner sc = new Scanner(System.in); // 객체를 사용할려면 new를 사용, System.in = 키보드에서 입력을 사용
		System.out.println("오늘 날짜는 ? : "); 
		String today = sc.nextLine(); // nextLine : 뒤에 다 읽어라, today라는 문자열(string) 변수에 넣자
		
		System.out.println("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.println("날짜 : " + today); // 프린트+변수 : 해당 변수 출력
		System.out.println("이름은 : " + name);
		System.out.println("학번은 : " + hakbun);
	}
}
