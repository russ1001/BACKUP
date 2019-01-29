
public class Circle {

	public double radius;
	
	
	// default constructor that takes no parameters
	// radius is always set to 10 here
	public Circle() {
		this.radius = 10;
	}
	
	// overloaded constructor that takes a single parameter
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	// can also use return radius * radius * Math.PI
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	// can also use return radius     getArea
	public String toString() {
		return "radius: " + this.radius + " area: " + this.getArea();	
	}
	
	public boolean radiusGreater(Circle c) {
		if(this.radius > c.radius) {
			return true;
		}
		else
			return false;
	}
	
	
}
