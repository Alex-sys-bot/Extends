package ru.sapteh;

public class Square extends Shape{
	private int side;
	
	public Square(String color, int  coordinateX, int coordinateY, int side){
		super(color,coordinateX,coordinateY);
		this.side = side;
	}
	
	
	public int getSide() {
		return side;
	}
	
	
	@Override 
	public String draw(){
		return "Square";
	}
	
	@Override
	public double area(){
		return side * side;
	}
	@Override
	public String toString(){
			   return String.format(
			   "Square color: %s coordinateX: %d coordinateY: %d side: %d draw: %s  area: %.2f",
			   super.getColor(),
			   super.getCoordinateX(),
			   super.getCoordinateY(),
			   getSide(),
			   draw(), 
			   area());
	}
}