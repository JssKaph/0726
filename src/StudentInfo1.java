import java.util.Scanner;

public class StudentInfo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 초기화, 키보드 입력
		
		System.out.println("귀하의 키는? : ");
		double height = sc.nextDouble();
		
		System.out.println("귀하의 몸무게는? : ");
		double weight = sc.nextDouble();
		
		System.out.println("키와 몸무게 :" + height + "," + weight);
		
		System.out.println("귀하의 키는? : ");
		height = sc.nextDouble(); //앞에서 변수를 호출했기 때문에 호출 하지않고 변수 사용
		
		System.out.println("귀하의 몸무게는? : ");
		weight = sc.nextDouble();
	}
}

