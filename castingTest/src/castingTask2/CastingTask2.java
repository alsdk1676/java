package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
		// Character 객체 'ksh'를 생성, 이름은 "ksh", 직업은 "사냥꾼"
		Character ksh = new Character("ksh", "사냥꾼");
		
		// 몬스터 객체 배열 생성: Fairy, Orc, Human 인스턴스가 각각 들어있음
		Monster[] monsters = {
			new Fairy("요정", 10, 100),
			new Orc("오크", 30, 250),
			new Human("인간", 1, 1000)
		};
		
		
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다.
//		오크 : 가죽을 얻는다
//		요정 : 날개를 얻는다
//		인간 : 갑옷을 얻는다.
		
		// 몬스터 배열을 순회하며 각각의 몬스터를 사냥
		for(int i = 0; i < monsters.length; i++) {
			// 'ksh' 객체의 hunt() 메서드를 호출, 각 몬스터를 사냥
			ksh.hunt(monsters[i]);
		}
		
//		for(Monster monster : monsters) {
//			ksh.hunt(monster);
//		}

	}
}
