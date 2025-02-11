package inheritanceTask;

// 상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다.

// Student 클래스
// 인스타아이디
// work 아르바이트를 한다.
// sleep 수업 시간에 잠을 잔다.
// eat 아침을 거른다.

// Employee 클래스
// 비상금
// work 하루 종일 일을 한다.
// sleep 잠을 설친다.
// eat 야식을 먹는다.

//메인 메서드 생성 후 객체화
//각 메서드 출력하기


public class InheritanceTask2 {
	public static void main(String[] args) {
//		Person sma = new Person("서민아", 25, "서울", "01045411676");
//		System.out.println(sma.name);
		
//		객체화
		Person person = new Person();
		Student student = new Student();
		Employee employee = new Employee();
		
//		메서드 출력
		person.work();
		person.sleep();
		person.eat();
		
		student.insta();
		student.work();
		student.sleep();
		student.eat();
		
		employee.emergency();
		employee.work();
		employee.sleep();
		employee.eat();
		
	}
	

}
