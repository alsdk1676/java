package abstractTest;

// 오류원인1) 부모 Pet은 구현이 안되서 메모리에 올라갈 수 없는 상태 => implements
public class Cat implements Pet {
	
	@Override
	public void sitDown() {
		System.out.println("앉으라고 하면 지 맘대로 앉는다");
	}
	
	@Override
	public void waitNow() {
		System.out.println("도망간다");
	}
	
	@Override
	public void poop() {
		System.out.println("고양이 모래에 배변훈련");
	}
}
