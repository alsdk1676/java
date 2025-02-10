package arrayTask;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//		주말 -> 메서드를 사용해서 코드를 간결하게 만들기

		
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.

//      .charAt()
//      단 문자열의 메서드는 사용하지 않는다.
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
		

//		Scanner sc = new Scanner(System.in);
//		String userInput = null, stringData = null, space = "\n";
//	      char[] charArray = null;
//	      int arrayLength = -1;
//	      
//	      System.out.println("문자열을 입력해주세요 : ");
//	      userInput = sc.nextLine();
//	      stringData = userInput + space;
//	      
//	      do {
//	         arrayLength++;
//	      } while (stringData.charAt(arrayLength) != '\n');
//	      
//	      charArray = new char[arrayLength];
//	      
//	      for(int i = 0; i < arrayLength; i++) {
//	         charArray[i] = stringData.charAt(i);
//	         if (charArray[i] >= 65 && charArray[i] < 97) {
//	            charArray[i] += 32;
//	         }else if (charArray[i] >= 97 && charArray[i] < 129) {
//	            charArray[i] -= 32;
//	         }
//	         System.out.print(charArray[i]);
//	      }          
//		===============================================================================
		
		Scanner sc = new Scanner(System.in);
//		String message = "문자열을 입력하세요.\nex)입력 : 안녕hI!! 출력 : 안녕Hi!!", userInput = null, result="";
//		char ch = ' ';
//	
//		System.out.println(message);
//		userInput = sc.nextLine();
//		
//		for(int i = 0; i < userInput.length(); i++) {
//			ch = userInput.charAt(i);
//			if(ch >= 'A' && ch <= 'Z') {
//				result += (char)(ch + 32);
//			} else if(ch >= 'a' && ch <= 'z') {
//				result += (char)(ch - 32);
//			}else {
//				result += ch;	
//				}
//		}
//		System.out.println(result);

//		===============================================================================
		
//      2) 정수를 한글로 변경
//		입력 값을 배열에 담고 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
		
//		String userInput = null, stringData = null, space = " ", message = "정수를 입력하세요.";
//	    int[] charArray = null;
//	    int arrayLength = -1;
//		String[] hangleArray = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
	      
//	    
//	    System.out.println(message);
//	    userInput = sc.nextLine();
//	    stringData = userInput + space;
//	    do {
//	    	arrayLength++;
//	    	} while (stringData.charAt(arrayLength) != ' ');
//	    
//	    charArray = new int[arrayLength];
//	    
//		for(int i = 0; i < arrayLength; i++) { 
//			charArray[i] = (int)stringData.charAt(i);
//			System.out.print(hangleArray[charArray[i] - 48]);
//		}
		
//		===============================================================================
//		String[] hangles = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//		String message2 = "정수를 입력하세요.\nex)1024", result = "", inputNum = "";
//		char c = ' ';
//		
////		사용자에게 정수 입력받는다.
//		System.out.println(message2);
//		inputNum = sc.nextLine();
//		
////		정수를 문자열로 바꾼다.
//		for(int i = 0; i < inputNum.length(); i++) {
//			c = inputNum.charAt(i);
//			int num = c - '0';
//		'0' ==> 48
//		'1'-'0' = 49 - 48 = 1
//			result += hangles[num];
//			
//		}
//		
//		System.out.println("결과 : " + result);
		

//		
//		===============================================================================
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
		
//		String userInput = null, stringData = null, space = "\n", message2 = "찾을문자 : ", message1 = "입력 : ", find = null;
//        char[] charArray = null;
//        int arrayLength = -1, count = 0;
//        
//        System.out.print(message1);
//        userInput = sc.nextLine();
//        
//        stringData = userInput + space;
//        do {
//           arrayLength++;
//        } while (stringData.charAt(arrayLength) != '\n');
////        배열 생성
//       charArray = new char[arrayLength];
//        
//       
////       찾을문자
//        System.out.print(message2);
//        find = sc.next();
//        for(int i=0; i<arrayLength;i++) {
//           charArray[i] = userInput.charAt(i);
//           if(charArray[i] == find.charAt(0)) {
//              count++;
//           }
//        }
//        System.out.println(find + "의 갯수 : " + count);
		
//		===============================================================================
		
		String message3 = "문자열을 입력하세요.", message4 = "찾을 문자 : ", inputString = null, findChar = null;
		int count = 0;
		
//		사용자에게 문자열을 입력받기
		System.out.println(message3);
		inputString = sc.nextLine();
		
//		사용자에게 찾을 문자 입력받기
		System.out.println(message4);
		findChar = sc.nextLine();
		
//		반복문 => 문자가 있으면 count 증가
		for(int i = 0; i < inputString.length(); i++)
			if(inputString.charAt(i) == findChar.charAt(0)) { 
				count++;
			}
		
		System.out.println(findChar + "의 개수 : " + count);
		
	}
}
