package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId; // session
	public static String code;
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
		String encryptPassword = null;
		if(userInDB == null) { // ID가 이미 존재하지 않으면
			encryptPassword = encrypt(user.getPassword());
			user.setPassword(encryptPassword);
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
			if(userInDB.getPassword().equals(encrypt(user.getPassword()))) {
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
//	public void changePassword(String password) {
//		for(User userInDB : users) {
//			if(userInDB.getPassword().equals(password)) {
//			}
//		}
//	}
	public void update(User user) { // 변경한 후 변경하시겠습니가? 하고 버튼 눌렀을 때 들어오는 데이터
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			userInDB.setPassword(encrypt(user.getPassword())); // 바꾸려는 새 비밀번호 가져와서 암호화
		}
//		if(userInDB.getPassword().equals(user.getPassword())) {
//			user.setPassword(password);
//			}
		}

	
//	비밀번호 변경(30일) : 로그인 된 상태이기 떄문에 30일 창 뜨는 것임
	public boolean update(String password, String newPassword) {
		User userInDB = checkId(userId); // 로그인이 되어있을 것이기 때문!
		if(userInDB.getPassword().equals(password)) {
			userInDB.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}	
	
	
//	인증번호 전송
	public void sendSms(String phoneNumber) {
		String api_key = "NCSLEFAFQVASCHYZ";
	      String api_secret = "M2YHU0XQQJ5AZBZLZJNUHZS8N7WEHKFD";
	      Message coolsms = new Message(api_key, api_secret);
	      
	      // 4 params(to, from, type, text) are mandatory. must be filled
	      HashMap<String, String> params = new HashMap<String, String>();
	      createCode(); // 날리기 전에 코드 먼저 날리기
	      params.put("to", phoneNumber);
	      params.put("from", "01045411676");
	      params.put("type", "SMS");
	      params.put("text", "[인증번호 6자리]\n" + code + "테스트 문자 발송");
	      params.put("app_version", "text app 1.2"); // application name and version

	      try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	      } catch (CoolsmsException e) { 
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	      }
	}
	
	
//	인증번호 생성
	public void createCode() {
		String randomCode = "";
		for(int i = 0; i < 6; i++) {
			randomCode += (int)Math.floor(Math.random() * 10);
		}
//		this.code = code;
		code = randomCode;
	}

	
//	인증번호 확인 (코드를 받았다는 전제하에)
	public boolean checkCode(String inputCode) {
		if(code.equals(inputCode)) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("abcdefg")); 
		uf.createCode(); // 리턴값이 아님
		uf.sendSms("01045411676");
		System.out.println(code);
		uf.checkCode("154835");
	}
	
}
