package ru.sapteh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	
public class Program{
	public static void main(String[] args) throws IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=============================Triangle=============================");
		System.out.println("Color :");
		String color = buffer.readLine();
		System.out.println("X :");
		int coordinateX = Integer.parseInt(buffer.readLine());
		System.out.println("Y :");
		int coordinateY = Integer.parseInt(buffer.readLine());
		System.out.println("Height :");
		int height = Integer.parseInt(buffer.readLine());
		System.out.println("Base :");
		int base = Integer.parseInt(buffer.readLine());
		
		
		System.out.println("=============================Square=============================");
		System.out.println("Color :");
		color = buffer.readLine();
		System.out.println("X :");
		coordinateX = Integer.parseInt(buffer.readLine());
		System.out.println("Y :");
		coordinateY = Integer.parseInt(buffer.readLine());
		System.out.println("Sides :");
		int sides = Integer.parseInt(buffer.readLine());
		
		
		
		System.out.println("=============================Circle=============================");
		System.out.println("Color :");
		color = buffer.readLine();
		System.out.println("X :");
		coordinateX = Integer.parseInt(buffer.readLine());
		System.out.println("Y :");
		coordinateY = Integer.parseInt(buffer.readLine());
		System.out.println("radius :");
		int radius = Integer.parseInt(buffer.readLine());
		
		
		Triangle triangle = new Triangle(color,coordinateX,coordinateY,height,base);
		Square square = new Square(color,coordinateX,coordinateY,sides);
		Circle circle = new Circle(color,coordinateX,coordinateY,radius);
		
		System.out.println("=============================Triangle=============================");
		System.out.println(triangle.toString() + "\t");
		System.out.println("=============================Square=============================");
		System.out.println(square.toString() + "\t");
		System.out.println("=============================Circle=============================");
		System.out.println(circle.toString() + "\t");
	}
} 