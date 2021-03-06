package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}
	public String toString(){
		return "Geom" + "("+ (int)this.firstValue() + ", " + (int)this.commonFactor + ")"; 
	}
	
	public double getTerm(int index) throws IndexOutOfBoundsException{
		
		return this.firstValue()*Math.pow(this.commonFactor, index - 1);
		
	}

}
