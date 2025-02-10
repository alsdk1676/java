package methodTask;

import java.util.Scanner;

public class MethodTask4 {
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//	void getStringCount(String content, char c) {
//		int count = 0;
//		for(int i = 0; i < content.length(); i++) {
//			if(content.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
//	=====================================================
//	1) 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	1. 문자열을 입력받는다
//	2. 원하는 문자를 입력받는다
//	3. 원하는 문자의 개수를 구한다
//	4. 원하는 문자를 찾는다. 어떻게 ? charAt()으로 찾기
//	5. 문자를 찾을 때마다 count++
	
//	1. 문자열을 입력받는다.
//	2. 원하는 문자를 입력받는다.
//	3. 원하는 문자를 찾는다. 어떻게?
//	4. 반복문으로 문자를 하나씩 찾는다
//	5. charAt()으로 원하는 문자가 있는지 비교한다.
//	6. 원하는 문자를 찾을때마다 count 증가시킨다.
//	7. 찾은 문자 개수를 출력한다.
	
//    int getStringCount(String content, char c) {
//        int count = 0;
//        for (int i = 0; i < content.length(); i++) {
//            if (content.charAt(i) == c) {
//                count++;
//            }
//        }
//        return count;
//    }
//	
	
	
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
//	1. 5개의 정수를 입력받는다
//	2. 원하는 인덱스의 값을 입력받는다.
//	3. 원하는 인덱스의 값을 구한다. 
//	4. 원하는 인덱스가 없을수도..? 있는지 확인하기

	int getIndex(int[] arData, int index) {
	    // 배열에 인덱스가 있는지 
	    if (index >= 0 && index < arData.length) {
	        return arData[index]; 
	    } else {
	        System.out.println("인덱스가 존재하지 않습니다!");
	        return -1;  
	    }
	}

//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//	사용자에게 한글을 입력받는다.
//	한글을 정수로 바꾼다 어떻게?
//	입력받은 한글에 대응하는 정수를 비교한다.
//	반복문을 돌려서 입력받은 한글에 대응하는 정수가 있는지 찾는다
//	정수를 누적합한다
//	결과를 출력한다
//	int changeToInteger(String hangle) {
////		.indexOf('일') : 값이 있으면 그 index 값을 리턴
//		String hangles = "공일이삼사오육칠팔구";
//		String result = "";
//		for(int i = 0; i < hangle.length(); i++) {
//	        // 한글 숫자 하나씩 가져와서 그 문자에 해당하는 인덱스를 찾음
//			result += hangles.indexOf(hangle.charAt(i));
////			hangle 입력 : 일이삼사
////			hangle.charAt(1) : 이
////			hangles.indexOf("이") : 2
//		}
//		return Integer.parseInt(result);
//	}
			
		
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
//	정수 5개를 입력받는다
//	반복문으로 최솟값 최댓값을 비교한다.
//	min보다 작으면 비교한 값이 min, max보다 크면 비교한 값이 max
	int[] getMinMax(int[] numArray) {
	    int max = numArray[0];
	    int min = numArray[0];
	    
	    for (int i = 1; i < numArray.length; i++) { 
	        if (numArray[i] > max) {
	            max = numArray[i];  
	        }
//	        두번 검사 => if if문 사용하기! : 위 조건식이 true여도 밑에 조건식 실행함
	        if (numArray[i] < min) {
	            min = numArray[i];  
	        }
	    }
	    
	    int[] minMaxArr = new int[2];  
	    minMaxArr[0] = min; 
	    minMaxArr[1] = max;  

	    return minMaxArr;  
	}
	
	
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개, 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//	정수 5개를 입력받는다
//	배열의 값 비교한다 => 반복문으로
	
	 void printMinMax(int[] numArray, int[] result) {
	        int max = numArray[0];
	        int min = numArray[0];

	        // 배열의 값 비교
	        for (int i = 1; i < numArray.length; i++) {
	            if (numArray[i] > max) {
	                max = numArray[i];  
	            }
	            if (numArray[i] < min) {
	                min = numArray[i]; 
	            }
	        }

	        result[0] = min;
	        result[1] = max;
	    }
	
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
//	사용자에게 문자열을 입력받는다.
//	문자열의 각 문자를 하나씩 확인한다.
//	반복문, charAt()
//	문자를 하나씩 확인해서 일치하면 인덱스 반환
	 
    int indexOf(String content, char c) {
//    	문자열의 각 문자를 하나씩 확인한다.
        for (int i = 0; i < content.length(); i++) {
//        	현재 문자와 검색할 문자가 같을 경우 ..
            if (content.charAt(i) == c) {
//            	인덱스를 리턴해줌
                return i;  
            }
        }
//        반복문으로 들어오지 않았을 경우 = 인덱스가 존재하지 않을 경우
        return -1;  
 
    }
    
	
	
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		
//		1번 문제
//		String message1 = "문자열을 입력하세요", content = null;
//		char ch = null;
//		int count = 0;
//		System.out.println(message1);
//		content = sc.next();
//		count = mt4.getStringCount(content, ch);
//		System.out.println("문자의 개수 : " + count);
//		=============================================
//		1번 문제
//		String message1 = "문자열을 입력하세요", message2 = "찾을 문자를 입력하세요.", content = null;
//		char c = ' ';
//		int count = 0;
//
//		System.out.println(message1);
//		content = sc.nextLine();
//		System.out.println(message2);
//		c = sc.nextLine().charAt(0);
//		
//		count = mt4.getStringCount(content, c);
//		
//		System.out.println("찾을 문자 : " + c + "\n문자의 개수 : " + count);
// 강사님 => int count = mt4.getStringCount("apple", 'p');
//		System.out.println(count);
		
//		2번 문제

//        int[] arData = new int[5];
//        String message3 = "5개의 정수를 입력하세요.\nex) 1 2 3 4 5", message4 = "인덱스를 입력하세요.\nex) 2";
//        		
////      정수 5개 입력받기
//        System.out.println(message3);
//        
//        for (int i = 0; i < 5; i++) {
//        	arData[i] = sc.nextInt();
//        }
//
//        // 원하는 인덱스 입력받기
//        System.out.println(message4);
//        int index = sc.nextInt();
//
//
//        int result = mt4.getIndex(arData, index);
//
//        if (result == -1) {
//            System.out.println("유효하지 않은 인덱스입니다.");
//        } else {
//            System.out.println("인덱스 값 : " + result);
//        }
//        
//        3번 문제
//        String message5 = "한글을 입력하세요.", hangle = null, result2 = "";
//        System.out.println(message5);
//        hangle = sc.nextLine(); 
//
//        result2 = mt4.changeToInteger(hangle);  
//
//        System.out.println(result2);  
		
//		4번 문제
		String message6 = "정수 5개를 입력하세요.\nex) 10 20 30 40 50";
        int[] numArray = new int[5]; 

        System.out.println(message6);
        for (int i = 0; i < 5; i++) {
            numArray[i] = sc.nextInt();
        }
        
        int[] minMaxArr = mt4.getMinMax(numArray);


        System.out.println("최솟값: " + minMaxArr[0]);
        System.out.println("최댓값: " + minMaxArr[1]);
        
//        강사님 int[] arResult = me4.getMinMax(new int[] {3, 6, 9, 1, 5});
		
		
//		5번 문제
//		String message9 = "5개의 정수를 입력하세요.";
//        int[] numArray = new int[5];  
//        int[] result = new int[2];   
//        
//        // 5개의 정수 입력 받기
//        System.out.println(message9);
//        for (int i = 0; i < 5; i++) {
//            numArray[i] = sc.nextInt();
//        }
//
//        // 최솟값 최댓값 메소드
//        mt4.printMinMax(numArray, result);
//
//        // 결과 출력
//        System.out.println("최솟값 : " + result[0]);
//        System.out.println("최댓값 : " + result[1]);

        
//      6번 문제
        String message7 = "문자열을 입력하세요.", message8 = "검색할 문자를 입력하세요.", content = null;
        char c = ' ';
        int result5 = 0;
        
        System.out.println(message7);
        content = sc.nextLine();
        
        System.out.println(message8);
       c = sc.nextLine().charAt(0); 

        // IndexOf 메소드 호출하여 결과 받기
        result5 = mt4.indexOf(content, c);
        
        System.out.println("입력한 문자열 : " + content);
        System.out.println("검색한 문자열 : " + c);

        // 결과 출력
//        if (result != -1) {
//            System.out.println("문자 '" + c + "'는 문자열의 " + result + "번째 인덱스에 있습니다.");
//        } else {
//            System.out.println("문자 '" + c + "'는 문자열에 없습니다.");
//        }
        
//        강사님 
//       mt4.indexOf("apple",'p');
		

		
		


	}
	
	

}
