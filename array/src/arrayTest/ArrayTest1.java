package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
//		1) 자료형 배열명 = {값1, 값2, ...} // 값을 알고 있을 떄
//		2) 자료형 배열명 = new 자료형[칸수] // new : 동적 할당할 수 있게 heap 영역에 메모리 올림
//		3) 자료형 배열명 = null; // 주소의 초기값이 null (초기화)
//		   배열명 = new 자료형[칸수];
		
//		int[] arr1 = {10, 20, 30};
//		System.out.println(arr1); // JVM이 관리하고 있는 해시코드의 주소값
//		System.out.println(arr1[1]); // 20

		int[] arr2 = {1, 32, 10, 11, 15};
		
		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
			arr2[i] = 5 - i;
			System.out.println(arr2[i]);
		}
		
		
//		arr2에 5, 4, 3, 2, 1 순서대로 담고 출력하기
		int[] newArr = {5, 4, 3, 2, 1};
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = newArr[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
		}
	}
}
