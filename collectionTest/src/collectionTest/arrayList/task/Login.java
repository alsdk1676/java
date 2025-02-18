package collectionTest.arrayList.task;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
//		단위 테스트
		User user = new User();
		user.setId("sma1234");
		user.setPassword("1234");
		
		System.out.println(user);
		
		if(userField.checkId(user.getId()) == null) {
			userField.join(user);
			System.out.println(DBConnecter.users); // toString 재정의한 필드 (배열안에 클래스(깩체)가 들어가 있는 형태) 
//			DB에 user가 들어가있기 때문에 회원가입 정상적으로 완료!
		}
		
		User userForLogin = new User();
		userForLogin.setId("sma1234");
		userForLogin.setPassword("12345");
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
//		로그인 후 session 대신 사용한 static 필드에 userId로 접근한다.
		System.out.println(UserField.userId);
		
//		마이페이지
		User foundUser = userField.checkId(UserField.userId); // 로그인됐다면 userId에 id가 들어가 있음
		foundUser.setPassword("6789"); // 아직 db에 들어가 있진 않음 (메서드 실행 시킺;않음) , 화면쪽에서만 변경
		
//		비밀번호 변경
		userField.update(foundUser);
//		System.out.println(userField.users);
		
//		로그아웃
		userField.logout();
		
		userForLogin = new User();
		userForLogin.setId("sma1234");
		userForLogin.setPassword("1234");
		
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
