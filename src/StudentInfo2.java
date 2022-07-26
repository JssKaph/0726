
public class StudentInfo2 {
	public static void main(String[] args) {
		 Student chulsu = new Student(); // Student는 참조형이기 때문에 값(ex.int) 를 넣지 못함, 
		 chulsu.name = "김철수"; // 철수(시작주소)라는 곳에 이름지정
		 chulsu.hakbun = "2022-001";
		 chulsu.kor = 80;
		 chulsu.eng = 100;
		 chulsu.mat = 85;
		 int total = chulsu.kor + chulsu.eng + chulsu.mat;
		 double avg = total / 3.0; // 실수가 될려면 분모나 분자 둘 중 하나가 실수가 되어야 한다.
		 System.out.printf("총점 : %d\n ", total);
		 System.out.println("평균 : " + avg);
	}
}
class Student{		//Student라는 객체의 설계도 , 하나의 자바 파일 안에는 여러개의 클래스를 넣을 수 있으나 퍼블릭 클래스,메인은 하나만 된다.
	String name;		//멤버, Field
	String hakbun;
	int kor;
	int eng;
	int mat;
}