package abstraction;

public class Coffee extends CoffeeType implements CoffeeBean {
	
	public void coffeeTree(){
		System.out.println("Coffee tree is Green Color");
	}
	public void plant() {
		System.out.println("We have to plant frist coffee tree");
	}
	public void collect() {
		System.out.println("When coffee is mature then we can collect coffee bean");
	}
	
	public void sorting(){
		System.out.println("We have to sort which coffee is best");
	}
	public void airCoffee() {
	System.out.println("In future we can invent air coffee");
	}
	
}