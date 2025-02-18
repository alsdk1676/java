package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ENFP");
		mbtiType.add("INFJ");
		mbtiType.add("ISFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("INFP");
		System.out.println(mbtiType);
		
//		Iterator
//		순서가 없을 때 순서를 부여하는 자료구조 , iterator을 도움을 받아서 가져와야한다.
		Iterator<String> iter = mbtiType.iterator();
//		iter.hasNext() // 가져올 게 없으면 false
		while(iter.hasNext()) { // 순서를 모르기 때문에 
			System.out.println(iter.next()); // 반복을 돌면서 다음 요소에 접근해서 하나씩 출력함
		}
		
		
//		중복된 데이터 삭제
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 9, 9 , 9)); // asList : 초기값 넣어줌
//		ArrayList -> Set 으로 변경(직접적으로 변경은 불가능) -> ArrayList : 중복O -> 중복 제거 -> 중복 제거된 상태로 출력
//		Set과 ArrayList는 섞어서 사용 가능
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas)); // 생성자한테 datas(=ArrayList)넘김
		System.out.println(datas); // [1, 2, 3, 4, 9]
	
	}

}



















