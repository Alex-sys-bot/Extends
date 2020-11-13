package ru.sapteh;

public abstract class Shape{
	private String color;
	private int coordinateX;
	private int coordinateY;
	
	public Shape(String color, int coordinateX, int coordinateY){
		this.color = color;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}
	
	public String getColor()    {
		return color;
	}
	public int getCoordinateX() {
		return coordinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	
	public abstract String draw();
	public abstract double area();
}

