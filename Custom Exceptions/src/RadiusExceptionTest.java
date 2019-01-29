
public class RadiusExceptionTest {

	
	public static void main(String[] args) {
		CircleWithRadiusException c1 = new CircleWithRadiusException();
		System.out.println("Area of c1 is: " + c1.findArea());
		
		CircleWithRadiusException c2 = new CircleWithRadiusException(120);
		System.out.println("Area of c2 is: " + c2.findArea());
		
		CircleWithRadiusException c3 = new CircleWithRadiusException(-59);
		System.out.println("Area of c3 is: " + c3.findArea());
	}
}
