package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId; // session
	final String SALT = "company";
	final int KEY = 300;
	
//	아이디 검사 : 주어진 ID가 이미 존재하는지 확인
	public User checkId(String id) {
		for(User user : users) { // 화면쪽 반복문은 빠른 for문 사용 =>  얼마나 들어올지 모르기 떄문
			if(user.getId().equals(id)) {
				return user; // user를 리턴했으니까 User 타입
			}
		}
		return null;
	}
	
//	회원가입 : 주어진 User 객체로 회원가입을 처리
//	public User join(String id, String name, String password, String phone) {
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) { // ID가 이미 존재하지 않으면
			users.add(user);  // users 리스트에 해당 User 추가
		}		
	}
	
//	로그인
//	public User login(String id, String password) {
//	public boolean login(User user) {
//		for(User userInDB : users) {	
//			if(userInDB.getId().equals(user.getId())) {// 전체가 true, false = boolean
//				if(userInDB.getPassword().equals(user.getPassword())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	
//	로그인 로직
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false; // return에 따라서 화면에 결과를 뿌리기 위해서 true false로 처리해줌! (기능만 구현하면 오류 발생 가능성)
	}
	
//	로그아웃
	public void logout() { // 로그아웃은 로그인 전제 (화면쪽에 추가로 검증할 필요없움)
		userId = null;
	}
	
	
//	암호화
	public String encrypt(String password) {
		String encryptPassword = SALT + password;
		String encryptedPassword = "";
		for(int i = 0; i < encryptPassword.length(); i++) {
			encryptedPassword += (char)(encryptPassword.charAt(i) * KEY);
		}
		return encryptedPassword;
	}
	
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(30일)
//	인증번호 전송
//	인증번호 확인	
	
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("abcdefg")); 
		
	}
	
}
