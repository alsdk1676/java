package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

// 관례 : 어떤 타입인지 모를 때 T(변수) 적어놓기
public class ArrayListTest<T extends Number> {
//		<?> : 제네릭 =>  값이 들어갈 떄 타입을 결정하는 문법 (어떤 값이 들어올 지 모르니까,,) - "포괄적인", "이름이 없는"
//		동적으로 할당되기 떄문에 <Integer> 생략 가능
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
	
	T data; // data의 변수 만듦

//	{
//		this.data = 20;
//	}
	
		
	public static void main(String[] args) {
		
		ArrayList<Integer> datas = new ArrayList<Integer>(); // Integer 배열
//		Integer[] arr = new Integer[];
		System.out.println(datas.size()); // length 대신 size
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		
//		가져오기
		try {
			
			datas.get(0); // get : return 타입 Integer (Integer로 값이 들어간다고 선언했으니까)
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
//		모든 데이터 확인
//		반복문
//		for(int i = 0; i < datas.size(); i++) {
//			각 필드값은 toString 재정의 -> ArrayList는 이미 재정의 되어있음 => 반복문 돌릴 필요 X
//		System.out.println(datas.get(i));
//		}
		
		System.out.println(datas); // [10, 30, 50, 60, 40, 20, 70, 80, 90]
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
//		50을 찾는다
		
		Collections.shuffle(datas); // shuffle : 랜덤으로 데이터 섞음
		System.out.println(datas);
		
		if(datas.contains(50)) {
			try {
//				datas.add(3, 500);
				datas.add(datas.indexOf(50) + 1, 500); // 데이터가 랜덤으로 섞여도 indexOf()로 항상 50의 인덱스를 찾음
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		};
		
		
		System.out.println(datas);
		
		
//		수정 : replace, set
//		수정 (90 -> 9) 
//		if(datas.contains(90)) {
//			int prev = 90; // 기능이면서 값을 리턴
//			try {
//				prev = datas.set(datas.indexOf(90), 9);
//				System.out.println("이전 값 : " + prev);
//			} catch(IndexOutOfBoundsException e) {
//				System.out.println("인덱스 처리 오류!");
//				e.printStackTrace();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//			}
//		}
//		System.out.println(datas);


//		80을 인덱스로 삭제
		if(datas.contains(80)) {	
			int prev = 0;
			try {
				datas.remove(datas.indexOf(80));
				System.out.println("삭제된 값 : " + prev);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		};
		
		System.out.println(datas);
		
		
//		80을 값으로 삭제 
		if(datas.contains(80)) {
			boolean isRemove = false; 
			try {
//				WrapperClass 랩퍼 클래스
//				작은 것을 큰 것으로 감싸는 것
//				isRemove = datas.remove(80); 80을 인덱스, 즉 int로 인식하고 있음 (오류)
				isRemove = datas.remove(Integer.valueOf(80)); // object로 인식함 => object는 int보다 Integer랑 가까움
//				Integer.valueof : int를 Integer로 변경 => 문법 때문에 사용 => 랩퍼 클래스
				System.out.println("삭제 여부 : " + isRemove);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		};
		
		System.out.println(datas);
	} 

}
