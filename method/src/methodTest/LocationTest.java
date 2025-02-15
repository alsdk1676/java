package methodTest;

public class LocationTest {
	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}
	
	public static void main(String[] args) {
		LocationTest ts = new LocationTest();
		int[] data = {50};
//		int data= 50;
		ts.test(data);
//		System.out.println(data); // 50
		System.out.println(data[0]); // 20 => 배열은 주소값을 전달하기 때문에 영역을 벗어나도 주소값에 접근할 수 있음 !
	}
}
