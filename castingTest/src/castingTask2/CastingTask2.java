package castingTask2;
//		오크, 요정, 인간을 사냥할 수 있다
//		오크 : 가죽을 얻는다.
//		요정 : 날개을 얻는다.
//		인간 : 갑옷을 얻는다.

public class CastingTask2 {
	public CastingTask2() {;}
	
	public void checkCharacter(Character character) {
		
	}

	public static void main(String[] args) {
		
		Character character = new Oak();

		
		if(character instanceof Oak) {
			Oak oak = (Oak)character;
			oak.hunt();
			
		}else if(character instanceof Elf) {
			Elf elf = (Elf)character;
			elf.hunt();
			
		}else if(character instanceof Human) {
			Human human = (Human)character;
			human.hunt();
		}
		
		CastingTask2 ct2 = new CastingTask2();
		ct2.checkCharacter(new Oak());
	}

}
