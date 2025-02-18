package tms_review2;
//공통 요구사항
//-각 클래스는 각 필드의 private이 붙어 있으며, 목적에 맞는 메서드를 구현해야한다
//-각 필드는 생성자를 통해 초기화 하며, 기본 생성자가 존재해야한다.
//(단, 상속받은 클래스는 부모를 통해 초기화한다.)
//-각 클래스는 toString이 재정의 되어 각 필드를 볼 수 있다.
//-각 클래스는 equals, hashcode가 재정의 되어있어 고유의 값(id)을 찾을 수 있다.
//- 어노테이션은 생략하지 않는다.
//- 각 필드는 필요에 따라 알맞는 자료구조를 선택한다.
// 
//
//클래스 (Lotto)
//- 고유 번호(id) 필드를 갖는다.
//- 로또번호(lottoNumbers)는 스태틱 필드를 갖는다.
//
//메서드 drawNumber()
//drawNumber()를 사용하여 추첨한다. 추첨은 아래와 같다.
//- 1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
//- 추출한 번호는 문자열 배열로 로또번호(lottoNumbers) 필드에 담아주는 기능을 가진 메서드이다.
// 
//메서드 sellLotto()
//- 해당 메서드를 사용하면, 회사원 또는 연구원에게만 로또를 판매하는 기능을 가진 메서드이다.
//(즉 회사원 또는 연구원의 필드에 접근하여 로또 번호를 입력할 수 있다.)
// 
//메서드 checkLotto
//- 로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인하여 값을 리턴하는 메서드이다.
//로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//- 로또는 모든 번호가 맞으면 당첨 아니면 꽝! 둘중 하나로만 결과를 알려주는 메서드이다

import java.util.Objects;

public class Lotto {
	private long id;
	private static String[] lottoNumbers;
	
//	기본 생성자
	public Lotto() {;}

	public Lotto(long id) {
		this.id = id;
	}
	
	public String[] luckyDraw() {		
		String[] luckyNumbers = new String[6];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		return luckyNumbers;
	}
	
	public void drawNumber() {		
		String[] luckyNumbers = new String[6];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		lottoNumbers = luckyNumbers;
	} 
	
//	로또 판매하기
	public void sellLotto(Person person) {
		if(person instanceof Employee) {
			((Employee)person).setLotto(this.luckyDraw());
		} else if(person instanceof Researcher) {
			((Researcher)person).setLotto(this.luckyDraw());
		} else {
			System.out.println("로또를 구매할 수 없습니다");
		}
	}
	
	public boolean checkLotto(Person person) {
		if(person instanceof Employee) {
			int count = 0;
			count++;
			String[] buyerLotto = ((Employee)person).getLotto(); 
			for(int i = 0; i < this.lottoNumbers.length; i++) {
				for(int j = 0; j < buyerLotto.length; j++) {
					if(lottoNumbers[i].equals(buyerLotto[i])) {
						count++;
						continue;
					}
				}
			}
			if(count == 6) {
				return true;
			}
				return false;
			} else if(person instanceof Researcher) {
			       int count = 0;
			         String[] buyerLotto = ((Researcher)person).getLotto();
			         for(int i = 0; i < this.lottoNumbers.length; i++) {
			            for(int j = 0; j < buyerLotto.length; j++) {
			               if(lottoNumbers[i].equals(buyerLotto[j])) {
			                  count++;
			                  continue;
			               }
			            }
			         }
			         if(count == 6) {
			            return true;
			}
			         return false;
		} else {
			System.out.println("구매 이력이 없어서 체크 불가능");
			return false;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}

	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}

	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return id == other.id;
	}
	
	public static void main(String[] args) {
      Lotto lotto = new Lotto();
      Person em1 = new Employee(1L, "일당백", 20, "01077776666", "IT", "코리아IT아카데미");
      Employee em2 = (Employee)em1;
      Person re1 = new Researcher(1L, "한우물", 35, "01044467878", "식물연구", "식물연구소");
      Researcher re2 = (Researcher)re1;
      
//	      로또 추첨
      lotto.drawNumber();
      
//	      로또 판매
      lotto.sellLotto(em2);
      lotto.sellLotto(re2);
      
//	      회사원 메서드 사용
      em2.byeCompany(lotto.checkLotto(em2));
      em2.saveMoney(lotto.checkLotto(em2));
      
//	      연구원 메서드 사용
      re2.buyFood(lotto.checkLotto(re2));
      re2.investLab(lotto.checkLotto(re2));
		
	}
	
	
	
	

	
	

}
