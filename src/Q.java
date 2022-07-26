import java.util.*;

public class Q {
	public static void main(String[] args) {
		Student xmin = new Student();
		Scanner sc = new Scanner(System.in); // 스캐너 초기화 System.in : 키보드 입력
		System.out.printf("학번을 입력하세요 : ");
		xmin.hakbun = sc.nextLine();
		System.out.printf("이름을 입력하세요 : ");		
		xmin.name = sc.nextLine();
		System.out.printf("국어의 점수를 입력하세요 : ");
		xmin.kor = sc.nextInt();
		System.out.printf("영어의 점수를 입력하세요 : ");
		xmin.eng = sc.nextInt();
		System.out.printf("수학의 점수를 입력하세요 : ");		
		xmin.mat = sc.nextInt();
		
		int total = xmin.kor + xmin.eng + xmin.mat;
		double avg = total / 3.0;

		System.out.printf("학번 : %s\n", xmin.hakbun);
		System.out.printf("이름 : %s\n", xmin.name);
		System.out.printf("국어 : %d\n", xmin.kor);
		System.out.printf("영어 : %d\n", xmin.eng);
		System.out.printf("수학 : %d\n", xmin.mat);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f", avg); // 평균은 소숫점 둘째자리 까지
	}
}
// println과 printf의 차이는? 
