package tms_review;

import java.util.Arrays;
import java.util.Objects;

//-로또(lotto), 조사(search)
//- work() 메서드를 재정의하며 "연구원은 조사(search)중이다."를 출력한다.
//- 조사(search)은 초기화된 필드의 값으로 출력한다.

public class Researcher extends Person {
	private String[] lotto;
	private String search;
	
	public Researcher() {;}

	public Researcher(String id, String name, int age, String phone, String job, String[] lotto, String search) {
		super(id, name, age, phone, job);
		this.lotto = lotto;
		this.search = search;
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
		return "Researcher [lotto=" + Arrays.toString(lotto) + ", search=" + search + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(search);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Researcher other = (Researcher) obj;
		return Arrays.equals(lotto, other.lotto) && Objects.equals(search, other.search);
	}
	
	
	
	
	
	

}
