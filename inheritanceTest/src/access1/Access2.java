package access1;

public class Access2 {
	public static void main(String[] args) {
		Access1 access1 = new Access1();
//		access1.
	}

}

package castingTask2;

//Base class
class Creature {
 // No methods here, since specific methods are in derived classes
}

//Derived class for Orc
class Orc extends Creature {
 public void getLeather() {
     System.out.println("오크 : 가죽을 얻는다.");
 }
}

//Derived class for Elf
class Elf extends Creature {
 public void getWings() {
     System.out.println("요정 : 날개를 얻는다.");
 }
}

//Derived class for Human
class Human extends Creature {
 public void getArmor() {
     System.out.println("인간 : 갑옷을 얻는다.");
 }
}

public class CastingTask2 {
 public static void main(String[] args) {
     // Array of creatures using upcasting
     Creature[] creatures = new Creature[3];
     creatures[0] = new Orc();
     creatures[1] = new Elf();
     creatures[2] = new Human();

     // Downcasting to call specific methods for each creature type
     for (Creature creature : creatures) {
         if (creature instanceof Orc) {
             ((Orc) creature).getLeather();
         } else if (creature instanceof Elf) {
             ((Elf) creature).getWings();
         } else if (creature instanceof Human) {
             ((Human) creature).getArmor();
         }
     }
 }
}
//=========================================================
//package castingTask2;
//
////Base class
//class Creature {
// // No methods here, since specific methods are in derived classes
//}
//
////Derived class for Orc
//class Orc extends Creature {
// public void getLeather() {
//     System.out.println("오크 : 가죽을 얻는다.");
// }
//}
//
////Derived class for Elf
//class Elf extends Creature {
// public void getWings() {
//     System.out.println("요정 : 날개를 얻는다.");
// }
//}
//
////Derived class for Human
//class Human extends Creature {
// public void getArmor() {
//     System.out.println("인간 : 갑옷을 얻는다.");
// }
//}
//
//public class CastingTask2 {
// public static void main(String[] args) {
//     // Create individual creature objects
//     Creature orc = new Orc();
//     Creature elf = new Elf();
//     Creature human = new Human();
//
//     // Downcast and call specific methods for each creature type
//     if (orc instanceof Orc) {
//         ((Orc) orc).getLeather();
//     }
//     if (elf instanceof Elf) {
//         ((Elf) elf).getWings();
//     }
//     if (human instanceof Human) {
//         ((Human) human).getArmor();
//     }
// }
//}

