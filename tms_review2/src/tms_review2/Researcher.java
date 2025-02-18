package tms_review2;

import java.util.Arrays;
import java.util.Objects;

//연구원
//각 필드는 아래와 같다.
//-로또(lotto), 조사(search)
//- work() 메서드를 재정의하며 "연구원은 조사(search)중이다."를 출력한다.
//- 조사(search)은 초기화된 필드의 값으로 출력한다.

//- investLab()
//연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
//1등이 아닐 시 콘솔에 “나에게 투자한다”를 출력한다.
// 
//- buyFood()
//연구원 1등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.
//1등이 아닐 시 콘솔에 “집에 쌀을 산다”를 출력한다.

public class Researcher extends Person {
	private long id;
	private String[] lotto;
	private String search;
	
//	기본 생성자
	public Researcher() {;}

//	초기화 생성자
	public Researcher(long id, String name, int age, String phone, String job, String search) {
		super(id, name, age, phone, job);
		this.search = search;
	}

//	getter, setter 메소드
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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "Researcher [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", search=" + search + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
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
		Researcher other = (Researcher) obj;
		return id == other.id;
	}
	
	@Override
	public void work() {
		System.out.println("연구원은" + this.getSearch() + "중이다.");
	}
	
	public void investLab(boolean lucky) {
		if(lucky) {
			System.out.println("연구에 투자한다.");
		} else {
			System.out.println("나에게 투자한다.");
		}
	}
	
	public void buyFood(boolean lucky) {
		if(lucky) {
			System.out.println("지인에게 밥을 산다.");
		} else {
			System.out.println("집에 쌀을 산다.");
		}
	}
	
	
	

}
