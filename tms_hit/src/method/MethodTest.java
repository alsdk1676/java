package method;

public class MethodTest {
	
//	~~~ 하겠다(maybe)
//	배열에 접근해서 값에 10을 더해준다 (클래스에 직접 접근을 하지 X)
	void add10(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] + 10;
			arr[i] += arr[i] + 10;
		}
	}
	
	public static void main(String[] args) {
//		사용하기 위해 객체화
		new MethodTest().add10(new Calc().arr2); // 전체가 void값 add10에서 기능만 수행해서
	}
	
	

}
