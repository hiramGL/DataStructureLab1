
public class AreaOfCircle {
	private static double area;
	public static void main(String[] args) {
		areaCalculator(2);
		System.out.println(area);
	}
	public static void areaCalculator(double radius){
		 area = Math.PI* Math.pow(radius, 2);
		
		
	}
}
