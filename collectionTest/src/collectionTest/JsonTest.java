package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "sma1234");
		userMap.put("password", "1234");
		userMap.put("name", "서민아");
		userMap.put("age", 26);
		
//		new JSONObject를 따서 타입을 JSONObject로 설정하기
		JSONObject json = new JSONObject(userMap); // 통째로가 json Object 타입 
		System.out.println(json); // toString 재정의 필드값
	}

}
