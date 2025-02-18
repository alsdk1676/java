package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonTest2 {
	public static void main(String[] args) {
		
//		JSON으로
		JSONObject userJSON = new JSONObject(); // Object로 먼저 바꾸기 (JSON으로 변환)
		JSONArray usersJSON = new JSONArray(); // Object로 변환 후 넣기 (JSONArray는 JSON으로 변환해주는게 아니라 모아놓는것)
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1, "서민아", 26, "학생");
		User user2 = new User(2, "홍길동", 20, "개발자");
		User user3 = new User(3, "장보고", 30, "요리사");
		User user4 = new User(4, "이순신", 40, "디자이너");
		User user5 = new User(5, "이성계", 50, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
//		new JSONObject(users); // JSONObject는 ArrayList 타입 받지 못함 (오버로딩 안되어있어서) => 반복문
//		for(User user: users) {
//			JSONObject jsonUser = new JSONObject(user); // 통째로가 JSONObject 타입
//		} ===> 람다식으로
		
		
//		for(User user : users) {
//			JSONObject JSONUSer = new JSONObject(user);
//			usersJSON.put(JSONUser);
//		} ===> 람다식으로
		
		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
			usersJSON.put(user);
		});           
		
//		참조하는 클래스::메서드 (생성자일경우 new)
		users.stream().map(JSONObject::new).forEach(usersJSON::put); // 참조형
		
		System.out.println(usersJSON);
		
		users.forEach((user) -> {
			System.out.println(user.toString());
		});
		
		
		
		
		
		
		
		
		

	}
}
