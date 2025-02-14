package casting;

public class CastingTest {
//	public void allType(모자 모자쓴애) {
//		모자쓴애 1반, 2반 => 여기서 이제 다른거 비교 즉 1반인지 2반인지 비교
//      모자쓴애 instanceof 1번
//		모자쓴애 instanceof 2번
//		instanceof
//	}
	
	
	public void allType(A a) {
//		B에 놀고있는 애를 쓰기 위해서 비교! =>  놀고있는애를 쓰고 싶으면 A로 형변환해줘야댐
		if(a instanceof A) {
			System.out.println("엄마ㄴ;까 엄마가 가진 A만 사용함");
			// 1990년도여도 사용할수없음
//			a.printB(); //없음
		}
		if(b instanceof B) {
			System.out.println("B 지금 놀고있음");
//			2000년도
			B b = (B)a; //일 좀해!
			b.printB();
		}
	}

}
