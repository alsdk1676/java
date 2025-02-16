package objectTest;

public class InnerTest {
	
//	내부 클래스 : 외부 클래스 안에서만 사용 가능함!
	public class InnerTest2 {
		private int value;
//		초기화블럭은 private이랑만 같이 쓸수잇나..? =>  그건 아님
		
		{
			this.value = 20;
		}
		
		public InnerTest2() {;}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
	}
	
	public static void main(String[] args) {
//		값을 직접 접근할 수 없다. 은닉화
//		InnerTest2 it2 = new InnerTest2(); // 내부클래스를 불러오려고 했더니 직접 접근 불가 오류 => 직접 접근이 어려운 은닉화!
//		외부 클래스 객체 먼저 생성한 후 내부 클래스 객체 생성하기
		InnerTest2 it2 = new InnerTest().new InnerTest2(); 
		System.out.println(it2.getValue());
	}

}
