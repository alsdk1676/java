package test;
// drawNumber 메서드 : 로또 번호 추첨한다.
// 1 ~ 45까지 숫자 중에서 랜덤으로 6개 뽑는다.
// 이미 뽑힌 당첨 번호라면..? 다시 뽑기
// 당첨 번호를 배열에 담는다.
// 당첨 번호 6개를 출력한다.
// checkLotto 메서드 : 로또 당첨 확인한다.
// 사용자에게 직업을 입력받는다. 연구원, 회사원, 기타(구매 불가)
// 1) 직업이 연구원 또는 회사원일 경우 
// - 사용자에게 로또 번호 6개 입력받는다.
// - 사용자가 입력한 번호가 1 ~ 45 넘어가면 다시 입력받는다.
// 2) 직업이 기타일 경우
// "회사원과 연구원이 아닌 경우 로또를 구매할 수 없습니다." 출력한다.
// 사용자가 입력한 번호와 당첨 번호를 비교한다.
// 입력한 번호와 당첨 번호 6개 모두 일치 => 1등
// 회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
// 연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
// 입력한 번호와 당첨 번호 5개 모두 일치 => 2등
// 회사원 2등 시 콘솔에 "전액을 저축한다"를 출력한다.
// 연구원 2등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.
// 입력한 번호와 당첨 번호 5개 미만 일치 => 다음 기회에... 

import java.util.Scanner;

public class Lotto {
    int[] luckyNumberArray;

    // 기본 생성자
    public Lotto() {;}

    // 초기화 생성자
    public Lotto(int[] luckyNumberArray) {
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
        String message = "당첨 번호 : ", space = " ";
        System.out.print(message);
        
        for(int i = 0; i < luckyNumberArray.length; i++) {
            System.out.print(luckyNumberArray[i] + space);
        }
        System.out.println();
    }
    

    // 당첨 확인
    public void checkLotto(Member member) {
        int count = count(member.getInputNumbers());

        if(count == 6) {
            member.winLottoFirst();
        }else if(count == 5) {
            member.winLottoSecond();
        }else {
            System.out.println("다음 기회에...");
        }
    }

    // 일치하는 개수 세기
    int count(int[] inputNumbers) {
        int count = 0;
        for(int i = 0; i < inputNumbers.length; i++) {
            for(int j = 0; j < luckyNumberArray.length; j++) {
                if(inputNumbers[i] == luckyNumberArray[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    // 메인 메서드에서 입력
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.drawNumber();

        // 사용자 입력 받기
        String message1 = "직업을 입력하세요.\nex) 회사원, 연구원, 기타", job = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message1);
        job = sc.nextLine();  

        Member member = null;
        String message2 = "로또 번호 6개를 입력하세요.\nex) 1 ~ 45 사이 숫자", message3 = "1 ~ 45 사이 숫자를 입력해주세요.";
        int[] inputNumbers = new int[6]; 
        int num = 0;

        if("회사원".equals(job) || "연구원".equals(job)) {
            System.out.println(message2);

            for(int i = 0; i < 6; i++) {
                while(true) {
                    System.out.print((i + 1) + "번째 번호 : ");
                    num = sc.nextInt();

                    if(num >= 1 && num <= 45) {
                        inputNumbers[i] = num;
                        break;
                    }else {
                        System.out.println(message3);
                    }
                }
            }

            switch (job) {
                case "회사원":
                    member = new Employee(job, inputNumbers);
                    break;
                case "연구원":
                    member = new Researcher(job, inputNumbers);
                    break;
                default:
                    return;
            }

            if(member != null) {
                lotto.checkLotto(member);
            }
        }else {
            System.out.println("회사원과 연구원이 아닌 경우 로또를 구매할 수 없습니다!");
        }
    }
}

// 회사원 연구원 부모 클래스
class Member {
    private String job;
    private int[] inputNumbers;  

//  기본 생생자
    public Member() {;}

//  초기화 생성자
    public Member(String job, int[] inputNumbers) {
        this.job = job;
        this.inputNumbers = inputNumbers;
    }

//  getter, setter 만들기
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int[] getInputNumbers() {  
        return inputNumbers;
    }

    public void setInputNumbers(int[] inputNumbers) {  
        this.inputNumbers = inputNumbers;
    }

    void winLottoFirst() {};
    void winLottoSecond() {};
}

// 회사원
class Employee extends Member {
    public Employee() {;}

    public Employee(String job, int[] inputNumbers) {
        super(job, inputNumbers);
    }

    @Override
    void winLottoFirst() {
        System.out.println("1등 당첨! 직장을 그만둔다.");
    }

    @Override
    void winLottoSecond() {
        System.out.println("2등 당첨! 전액을 저축한다.");
    }
}

// 연구원
class Researcher extends Member {
    public Researcher() {;}

    public Researcher(String job, int[] inputNumbers) {
        super(job, inputNumbers);
    }

    @Override
    void winLottoFirst() {
        System.out.println("1등 당첨! 연구에 투자한다.");
    }

    @Override
    void winLottoSecond() {
        System.out.println("2등 당첨! 지인에게 밥을 산다.");
    }
}
