
public class TestCircleRectangle {

	public static void main(String[] args) {
	
		Circle4 circle4 = new Circle4(1);
		System.out.println("A circle " + circle4.toString());
		System.out.println("The radius is " + circle4.getRadius());
		System.out.println("The diameter is " + circle4.getArea());
		System.out.println("The area is " + circle4.getDiameter());
		
		Rectangle1 rectangle1 = new Rectangle1(2,4);
		System.out.println("\nA rectangle " + rectangle1.toString());
		System.out.println("The area is " + rectangle1.getArea());
		System.out.println("The perimeter is " + rectangle1.getPerimeter());
		
		
		
	}
	
}
