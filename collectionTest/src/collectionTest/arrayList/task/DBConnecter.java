package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.Objects;

public class DBConnecter {
//	회원 여러명, 회원 한명의 정보도 여러 개 : 배열 안에 배열 또는 배열 안에 클래스
	
	public static ArrayList<User> users = new ArrayList<User>();
	String id;
	String name;
	String password;
	String phone;
	
	public DBConnecter() {;}

	public DBConnecter(String id, String name, String password, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		DBConnecter.users = users;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DBConnecter other = (DBConnecter) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone);
	}
	
	
	
	

}
