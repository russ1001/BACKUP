
public class CircleDriver {

	public static void main(String[] args) {
		Circle circleOne = new Circle();
		Circle circleTwo = new Circle();
		
		// getRadius is called using the default constructor 
		System.out.println(circleOne.getRadius());
		System.out.println(circleTwo.getRadius());
		
		// once the setRadius is invoked
		// then the radius is what was set 
		// no longer using the default
		circleOne.setRadius(30);
		circleTwo.setRadius(50);
		
		
		System.out.println(circleOne.getRadius());
		System.out.println(circleTwo.getRadius());
		
		
		System.out.println(circleOne.getArea());
		System.out.println(circleTwo.getArea());
		
		System.out.println(circleOne);
		System.out.println(circleTwo);
		
		
		if(circleOne.radiusGreater(circleTwo)) {
			System.out.println("circleOne has a larger radius.");
		}
		else {
			System.out.println("circleTwo has a larger radius.");
		}
		
	}
}
