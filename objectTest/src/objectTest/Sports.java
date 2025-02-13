package objectTest;

public class Sports { // Object : 모든 클래스의 부모 (extends Object 생략)
//	Object클래스 생성 시 필수 진행 순서
//	1. 기본생성자
//	2. 초기화생성자
//	3. private 붙이기 (그리드 모드로)
//	4. getter, setter
//	5. toString 재정의(오버라이딩)
//	6. hashcode, equlas 재정의
	
	
//	Alt + Shift + A : 그리드 모드
	private String type;
	private int total;
	
	public Sports() {;}
	
	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}
	
//	alt + shift + s -> r -> alt + a -> r -> getter, setter
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

//	alt + shift + s -> s // toString 재정의
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.hashCode(); // hashCode : 중복없이 관리하는 고유한 번호(값)
		System.out.println(sports.hashCode());
//		sports.toString();
		System.out.println(sports.toString()); // toString : 문자열로 바꿈 , 주소값 / 내 필드값이 어디 들어갔는지 확인하기 위한 용도 => 오버라이딩 필요!!
//		sports.equals(sports);
		
	}

	

}
