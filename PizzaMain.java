package Pizza;

public class PizzaMain {

	public static void main(String[] args) {
//		boolean veg;
//		Pizza basePizza = new Pizza(true);
//		basePizza.addExtraToppings();
//		basePizza.addExtraCheese();
//		basePizza.getBill();
		
		
		DeluxPizza dp = new DeluxPizza( true);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.getBill();
	}

}
