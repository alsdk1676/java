package ex03;
//Programmer 클래스(자식클래스)
//*Programmer 클래스는 Person 클래스를 상속받는 클래스이다
//
//필드   
//학생은 공부하는 노트북(notebook)의 필드 값 불리언(boolean)형으로 존재한다.
//
//생성자   
//모든 매개변수를 받는 생성자(부모클래스의 생성자 호출)를 만드세요.
//
//메소드   
//work 메소드 오버라이딩
//ex) “OO은 코딩을 합니다.” 출력하는 메소드
//*OO은 해당 필드의 직업의 이름을 넣으세요.
//
//hobby 메소드 오버라이딩
//배열(arData)에 A, B, C, D를 담고
//ABCD를 순서대로 출력하시오.
//
//isNotebook 메소드 : 리턴타입x, 매개변수 x
//개발자의 노트북이 있으면 노트북이 있습니다.
//없으면 노트북이 없습니다를 출력(if~else문 사용)

public class Programmer extends Person{
	boolean notebook;
	
	public Programmer() {;}

	public Programmer(String name, int age, String job, String hobby, boolean notebook) {
		super(name, age, job, hobby);
		this.notebook = notebook;
	}
	
	@Override
	void work() {
		System.out.println(name + "는 코딩을 합니다.");
	}
	
	@Override
	void hobby() {
		String[] arData = {"A", "B", "C", "D"};
		for(int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]);
		}
		System.out.println();
	}
	
	void isNotebook() {
		if(notebook) {
			System.out.println("노트북이 있습니다.");
		} else {
			System.out.println("노트북이 없습니다.");
		}
	}
	

}
