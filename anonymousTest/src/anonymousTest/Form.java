package anonymousTest;

// 가입 양식
// 메뉴 받기, 판매
public interface Form {
//	추상 메서드 2개
	public String[] getMenus();
	public void sell(String menu);
	public void isFree(String menu);

}


