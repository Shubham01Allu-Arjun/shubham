package Anudip;

public class Area implements Shape {
	
	//class is inherited through interface
	//method to calculate are of rectangle
	@Override
	public double RectangleArea(double length, double bredth) {
		return bredth*length;//formula to calculate rectangle
	}

	//method to calculate are of rectangle
	@Override
	public double SquareArea(double length) {
		return length*length;////formula to calculate square
	}
	//method to calculate are of rectangle
	@Override
	public double CircleArea(double radius) {
		return ((22/7)*radius*radius);//formula to calculate circle
	}
}