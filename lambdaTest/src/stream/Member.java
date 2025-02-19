package stream;

import java.util.Objects;

public class Member {
	String name;
	String hobby;
	String introduce;
	
	public Member() {;}

	public Member(String name, String hobby, String introduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getHobby() {
		return hobby;
	}

	void setHobby(String hobby) {
		this.hobby = hobby;
	}

	String getIntroduce() {
		return introduce;
	}

	void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hobby, introduce, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(introduce, other.introduce)
				&& Objects.equals(name, other.name);
	}
	
	

	

}
