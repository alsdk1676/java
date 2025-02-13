package objectTest;// 기본 자료형의 불변성 ABC가 선언되어있는 주소값이 같음! ex) text 영역 300번지..
// 동등비교연산자 == 는 주소값을 비교

public class EqualsTest {
   public static void main(String[] args) {
      String data1 = "ABC";0
      String data2 = "ABC";
      String data3 = new String("ABC");
      String data4 = new String("ABC");
            
      System.out.println(data1);
      System.out.println(data2);
      System.out.println(data3);
      System.out.println(data4);
      System.out.println(data1.equals(data4));
      System.out.println(data1 == data3);
      
   }
}
