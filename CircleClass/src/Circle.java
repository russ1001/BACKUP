import java.util.*;

/* UML Diagram
 * 
 * Circle						name
 * ----------------------------------------------------------------
 * radius: double				properties and variables
 * ----------------------------------------------------------------
 * Circle()						methods
 * Circle(r:double)
 * getArea(): double
 * getPer(): double
 * setRadius(rad:double):void
 * ----------------------------------------------------------------
 
 *c1:Circle
 *-----------------------------------------------------------------
 *radius = 1
 *
 *
 *A Class is a blueprint for an object
 *		- it describes the data an object has, and the methods it contains and its behavior
 *
 *An Object is an instantiation of a class 
 *		- For example, 3 circles, each with a different radius, all constructed from the Circle class
 *
 *Can represent classes using UML class diagrams
 *
 *
 *
 *
 */

public class Circle {

	
	// declare radius
	// this is a member variable
	// any object we create has a copy of this member variable
	private double radius;
	
	
	
	// create default constructor
	public Circle() {
		radius = 0;
	}
	

	
	
	// use constructor and take in radius as a parameter
	public Circle(double newRadius) {
		// this refers to the particular object that we are operating on now
		this.radius = newRadius;
	}
	
	
	
	// create constructor getArea
	// returns area
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	
	// create constructor getPerimeter
	// returns perimeter
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	
	
	// set the radius
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	
	
	
	
	
	
}
