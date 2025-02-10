package classTest;

public class StaticTest {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {
//		1)
//		StaticTest st = new StaticTest(); // 클래스 호출 (객체화), st : 생성자 ex)100번지
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st = new StaticTest(); // 다른 주소값의 객체 ex)200번지
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		=====================================	
//		2)
//		StaticTest st = new StaticTest(); 
////		static 영역
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
////		heap 영역 , 영역이 달라서 값을 덮어쓸 수 없음!
//		st = new StaticTest();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		st.increase_s();
//		=====================================
//		3)
		StaticTest st = new StaticTest(); 
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st = new StaticTest();
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		increase_s();
		increase_s();

	}
}
