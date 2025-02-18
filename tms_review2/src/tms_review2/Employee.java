package tms_review2;

import java.util.Arrays;
import java.util.Objects;

//회사원(Company)
//각 필드는 아래와 같다.
//-로또(lotto), 회사(company)
//- work() 메서드를 재정의하며 "직업(job)은 하루종일 일을한다"를 출력한다.
//- 직업(job)은 초기화된 필드의 값으로 출력한다.

//- byeCompany()
//회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
//1등이 아닐 시 콘솔에 “다시 일한다”를 출력한다.
// 
//- saveMoney()
//회사원 1등 시 콘솔에 "전액을 저축한다"를 출력한다.
//1등이 아닐 시 콘솔에 “다시 돈 번다”를 출력한다.

public class Employee extends Person {
	private long id;
	private String[] lotto;
	private String company;
	
//	기본 생성자
	public Employee() {;}

//	초기화 생성자
	public Employee(long id, String name, int age, String phone, String job, String company) {
		super(id, name, age, phone, job);
		this.company = company;
	}
	
//	setter, getter 메소드
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String[] getLotto() {
		return lotto;
	}

	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(company, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && id == other.id && Arrays.equals(lotto, other.lotto);
	}
	
	
	@Override
	public void work() {
		System.out.println(this.getJob() + "은 하루종일 일을 한다.");
	}
	
	public void byeCompany(boolean lucky) {
		if(lucky) {
			System.out.println("직장을 그만둔다.");
			} else {
				System.out.println("다시 일한다.");
			}
	}
	
	public void saveMoney(boolean lucky) {
		if(lucky) {
			System.out.println("전액을 기부한다.");
		} else {
			System.out.println("다시 돈 번다.");
		}
	}
	


}
