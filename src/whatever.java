
// Rename the class to Surface Calculator
// Create a new package and move this class to a new package
public class whatever {

	private static final double PI = 3.1416159;
	private int field1; // Encapsulate this field.
	
	public double calculateConeSurface(double radius, double height) {
		// Create a constant for PI
		// Extract a method for calculating a circle area 
		double baseArea = CalculateCircleArea(radius);
		double surface = PI * radius * height;
		return  baseArea + surface;
	}

	private double CalculateCircleArea(double radius) {
		return PI * radius * radius;
	}
	
	// Change signature to make parameter order consistent
	// Change the name of the method to calculateCylinderSurface
	public double cylinderArea(double radius, double height) {
		double baseArea = CalculateCircleArea(radius);
		double surface = 2 * PI * radius * height;
		return  baseArea + surface;
	}

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}
}
