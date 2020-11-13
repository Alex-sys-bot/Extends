package ru.sapteh;

public class Triangle extends Shape{
	private int height;
	private int base;
	
	
	public Triangle(String color, int  coordinateX, int coordinateY, int height, int base){
		super(color, coordinateX, coordinateY);
		this.base = base;
		this.height = height;
	}
	
	public int getBase(){
		return base;
	}
	
		public int getHeight(){
		return height;
	}
	
	@Override
	public String draw(){
		return "Triangle";
	}
	
	@Override
	public double area(){
		return 0.5 * base * height;
	}

	@Override
	public String toString(){
		return String.format("Triangle Color: %s CoordX: %d CoordY: %d Height: %d Base: %d Draw: %s Area: %.2f",
			   super.getColor(), super.getCoordinateX(), super.getCoordinateY(), getHeight(), getBase(), 
			   draw(), area());
	}
}