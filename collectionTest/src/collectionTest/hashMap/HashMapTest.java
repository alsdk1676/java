package collectionTest.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>(); // value는 어떤 게 들어와도 상관없으니 Object
		userMap.put("id", "sma1234"); // 찾아갈 수 있게 이름표
		userMap.put("password", "1234");
		userMap.put("name", "서민아");
		userMap.put("age", 26);
		
		System.out.println(userMap.size());
		System.out.println(userMap); // {} : 객체 , 순서 없음 => 가져오고싶으면 key값으로 가져와야함
		System.out.println(userMap.get("id")); // sma1234
		
//		entry 엔트리 (key와 value를 묶어놓음) : 순서 없음 => iterator로 순서 만들어줌
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator(); // => 통째로가 iterator타입
//		iter : 순서 생김, 데이터가 몇개 들어가있는지 모름
		
		
//		entry : key, value를 한 쌍씩 가지고 있는 자료구조
//		entrySet() : Set 자료구조로 바꾼다.
//		순서가 없기 때문에 iterator() 사용
		
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
//			System.out.println(entry); // key와 value 가지고 있음
//			entry.getKey("name"); // 이름만 다 가져오고 싶을 때 ===>  오류!! getKey는 매개변수를 받지 않기 때문 => 이 자체로 가져온 것
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			}
		}
		
	}

}
