package ru.sapteh;

public class Circle extends Shape{
	private int radius;
	
	public Circle(String color, int coordinateX, int coordinateY, int radius){
		super(color,coordinateX,coordinateY);
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
	

	@Override 
	public String draw(){
		return "Circle";
	}
	
	@Override
	public double area(){
		return Math.PI * (radius * radius);
	}
	
	
	@Override
	public String toString(){
			   return String.format(
			   "Circle color: %s coordinateX: %d coordinateY: %d radius: %d draw: %s area: %.2f",
			   super.getColor(),
			   super.getCoordinateX(),
			   super.getCoordinateY(),
			   getRadius(),
			   draw(), 
			   area());
	}
}