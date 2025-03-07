package tms_review2;

import java.util.Objects;

//사람(Person)
//각 필드는 아래와 같다.
//- 아이디(id), 이름(name), 나이(age), 전화번호(콜), 직업(job)
//- 회사원과 연구원은 사람을 상속 받으며, 부모를 생성자(constructor)를 통해 초기화한다.
//- 일한다(work)의 메소드를 갖는다
//- 메소드는 “일을 합니다”를 출력한다.

public class Person {
	private long id;
	private String name;
	private int age;
	private String phone;
	private String job;
	
//	기본 생성자
	public Person() {;}

//	초기화 생성자
	public Person(long id, String name, int age, String phone, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}

//	getter, setter 메소드
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", job=" + job + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
	
	public void work() {
		System.out.println("일을 합니다.");
	}
	
	

}
