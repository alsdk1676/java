package objectTest;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {;}
	

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
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
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		Student student = new Student(1, "서민아", 20); // 100번지
		
		if(student.equals(new Student(1, "서민아", 20))) { // 값을 비교한다고 했는데 비교를 못하고 있네 ..? 클래스가 가지고 있는건 주소값 200벉;
			System.out.println("책 대여");
		}else {
			System.out.println("도난 신고");
		}
		
	}

	
	
	

	
	

}
