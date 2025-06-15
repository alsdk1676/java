package castingTask3;

public class CastingTask {
	public void orderFood(Food food) {
		if(food instanceof Burger) {
			Burger burger = (Burger)food;
			burger.addKetchup();
		} else if(food instanceof Pizza) {
			Pizza pizza = (Pizza)food;
			pizza.addCheese();
		}else if(food instanceof Sushi) {
			Sushi sushi = (Sushi)food;
			sushi.addWasabi();
		}
	}
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.orderFood(new Burger());
		ct.orderFood(new Pizza());
		ct.orderFood(new Sushi());
	}

}
