package anonymousTest;

// 실습
// 잠실점 오픈
// 무료나눔 행사중(판매 안됨)
// 무료나눔 행사 중이라면, "무료나눔 행사 승인" 출력
// 무료나눔 행사 중이 아니라면, 판매

public class AnonymousTest {
	public static void main(String[] args) {
		
//		implement 한 것과 동일하지만, 한 번만 사용하기 위해 작성한다. (1회용)
		Study study = new Study() { // 업캐스팅 : 익명 클래스(자식)가 부모의 인터페이스 들어감
//			메서드의 선언은 클래스 안에서 가능
			@Override
			public void setTopic(String topic) {
				System.out.println("주제 : " + topic);
			}
		};
		
		study.setTopic("화학");
	}

}

