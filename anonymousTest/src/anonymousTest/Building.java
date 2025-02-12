package anonymousTest;

public class Building{
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
//		new Form() : 추상 메스드가 작동되는 동시에, 등록됨과 동시에 판매됨
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매 완료");
						break;
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			
		});
		
//		잠실점 등록
		Starbucks jamsil = new Starbucks();
		jamsil.register(new FormAdapter() { // 업캐스팅 : formadapter는 form을 상속받고 있으므로 자식! (implements) 
//			Form 부모 자리에 FormAdapter 자식을 담았으니 업캐스팅
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "아망추", "아샷추", "야우추"};
			}
        });
	}
}
