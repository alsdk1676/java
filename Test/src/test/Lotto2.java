package test;

public class Lotto2 {
	int[] luckyNumberArray;
	
//	기본 생성자
	public Lotto2() {;}

//	초기화 생성자
	public Lotto2(int[] luckyNumberArray) {
		this.luckyNumberArray = luckyNumberArray;
	}
	
    // 랜덤 당첨 번호
    public String[] getLuckyNumber() {
        String[] luckyNumberArray = new String[6];
        
        for(int i = 0; i < 6; i++) {
            luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
            for(int j = 0; j < i; j++) {
                if(luckyNumberArray[j].equals(luckyNumberArray[i])) {
                    i--; 
                    break;
                }
            }
        }
        return luckyNumberArray;
    }
    
    // 로또 번호 추첨
    public void drawNumber() {
        luckyNumberArray = new int[6];
        
        // 로또 번호 6개 랜덤 뽑기
        String[] luckyNumbers = getLuckyNumber();  

        for(int i = 0; i < 6; i++) {
            luckyNumberArray[i] = Integer.parseInt(luckyNumbers[i]);
        }
        
        // 당첨 번호 6개 출력
        printArray(luckyNumberArray);
    }
    
    public void printArray(int[] luckyNumberArray) {
    	String message1 = "당첨 번호 :  ", space = " ";
    	System.out.println(message1);
    	
    	for(int i = 0; i < luckyNumberArray.length; i++) {
    		System.out.println(luckyNumberArray + space);
    	}
    	System.out.println();
    	
    }
    
    public void checkLotto(Member member) {
    	int count = count(member.getInputNumbers());
    }
	
	

}
