package abstraction;

public class Main {

	public static void main(String[] args) {
		
		CoffeeBean CoffeeBean = new Coffee();
		CoffeeBean.plant();
		CoffeeBean.collect();
		CoffeeBean.sorting();
				
		CoffeeType CoffeeType = new Coffee();
		CoffeeType.soil();
		CoffeeType.place();
		CoffeeType.fertilizer();
		
		Coffee columbian = new Coffee();
		columbian.coffeeTree();
		columbian.airCoffee();
	}

}