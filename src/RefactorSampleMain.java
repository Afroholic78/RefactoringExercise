
public class RefactorSampleMain {

	public static void main(String[] args) {
		whatever calc = new whatever();
		calc.setField1(100);
		
		System.out.println("Cone: " + calc.calculateConeSurface(50, 10));
		System.out.println("Cilinder: " + calc.cylinderArea(10, 50));
	}
}
