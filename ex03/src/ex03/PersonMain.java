package ex03;
//main 메소드를 구성하여 아래의 조건을 모두 실행하세요.
//
//메서드
//1.학생(student), 프로그래머(programmer)를 Person 클래스 타입으로 업캐스팅하여 객체화(instance)를 생성한다.
//2. Person으로 업캐스팅한 객체를 다운캐스팅하여 
//각각 아래에 메서드를 모두 호출하세요
//
//Student : work, hobby, printNumber
//programmer : work, hobby, isNotebook;

public class PersonMain {
	
	public void kindPerson(Person person) {
		if(person instanceof Student) {
			Student student = (Student)person;
			student.work();
			student.hobby();
			student.printNumber();
		}else if(person instanceof Programmer) {
			Programmer programmer = (Programmer)person;
			programmer.work();
			programmer.hobby();
			programmer.isNotebook();
		}
	}
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.kindPerson(new Student("서민아", 26, "학생", "코딩", 12345678));
		pm.kindPerson(new Programmer("서민아", 26, "학생", "코딩", true));
	}

}
