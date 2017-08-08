package abstraction;

public abstract class CoffeeType {

	public void soil(){
		System.out.println("we have to test the soil for coffee tree");	
	}
	public void place(){
		System.out.println("Hill is the best place for coffee tree ");
	}	
	public void fertilizer(){
		System.out.println("Sometimes we need to use fertilizer to produce best coffee");
	}
	public abstract void airCoffee();
}
