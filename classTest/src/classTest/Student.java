package classTest;

import java.util.Scanner;

public class Student {
//	학생 1명
//	학생의 학번, 이름, 국어 점수, 영어 점수, 수학 점수를 입력받고
//	총점과 평균을 출력하기
	
//	추상화
	int studentNum;
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
//	기본 생성자
	public Student() {;} // 생성자도 메서드
	
//	생성자
	public Student(int studentNum, String name, int korScore, int engScore, int mathScore) {
//		초기화
		this.studentNum = studentNum;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.total = korScore + engScore + mathScore;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	
//	총합
	int total(int korScore, int engScore, int mathScore) {
		return korScore + engScore + mathScore;
	}
	
//	평균
	int avg(int total) {
		return total / 3;
	}
	
	public static void main(String[] args) {
		Student st = new Student(1, "서민아", 70, 80, 90);
		Scanner sc = new Scanner(System.in);
		int studentNum = 0, korScore = 0, engScore = 0, mathScore = 0, score = 0;;
		String name = "", message1 = "학번을 입력하세요.", message2 = "이름을 입력하세요.", message3 = "국어, 영어, 수학 점수를 입력하세요.\nex) 80 90 100";
		
		System.out.println(message1);
		studentNum = sc.nextInt();
		
		System.out.println(message2);
		name = sc.nextLine();
		
		System.out.println(message3);
		score = sc.nextInt();
		
		
	}

}
