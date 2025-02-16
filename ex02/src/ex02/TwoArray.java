package ex02;
//[출력결과]
//배열의 행 길이 : 3
//배열의 열 길이 : 4
//1 2 3 4 
//5 6 7 8
//9 10 11 12

// 12칸짜리 배열 만들기
// 1~4 줄바꿈 5~8 줄바꿈 9~10
// 줄바꿈 => println()
public class TwoArray {
	public static void main(String[] args) {
		int[] arData = new int[12];
		
		for(int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.print(arData[i] + " ");
		}
		System.out.println();
		
		for(int i = 4; i < 8; i++) {
			System.out.print(arData[i] + " ");
		}
		System.out.println();
		
		for(int i = 8; i < 12; i++) {
			System.out.print(arData[i] + " ");
		}
		System.out.println();
	}
}
