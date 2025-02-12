package anonymousTest;

public class Starbucks {
	
	public void register(Form form) { // Form 부모를 매개변수로 받음 , form에 들어온게 form인지 formadapter인지 비교하기(자식인지 부모인지)
		String[] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		판매 중인 곳인지, 무료나눔을 하고 있는 곳인지 판별
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사 중");
		} else {
			form.sell("에이드");
		}
		
		
//		form.sell("에이드");
//		form.sell("스무디"); // 출력 안됨
	
	}
}
