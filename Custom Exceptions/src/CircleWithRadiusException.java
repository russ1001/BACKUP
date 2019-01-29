

public class CircleWithRadiusException {

	
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithRadiusException()	{
		this(1.0);
		
	}
	
	public CircleWithRadiusException(double newRadius) {
		
		try {
			setRadius(newRadius);
			numberOfObjects++;
		}
		catch(InvalidRadiusException ex) {
			System.out.println("ERROR: Cannot have a negative radius");
			//ex.printStackTrace();
		}
		
	}
	
	public void setRadius(double newRadius) 
		throws InvalidRadiusException{
		
		if(newRadius >= 0) {
			radius = newRadius;
		}
		else {
			throw new InvalidRadiusException(newRadius);
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double findArea() {
		return radius * radius * Math.PI;
	}
	
	
	
	
}
