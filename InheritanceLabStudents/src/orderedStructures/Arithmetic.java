package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}
	
	public String toString(){
		String result;
		result = "Arith";
		
		return "Arith" + "(" + (int)this.firstValue() + ", " + (int)this.commonDifference + ")";
		
	}
	public double getTerm(int n) throws IndexOutOfBoundsException{
		//need implement
		return 12;
		
	}

}
