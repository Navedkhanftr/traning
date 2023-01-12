package com.bharatpalle;

public class TestAbstraction1 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();

	}

}
abstract class Shape{
	 abstract void  draw();
	 public void display() {
		 System.out.println("hey i am nk from rajsthan ");
		 
	 }
}
class Reactangel extends Shape{

	@Override
	void draw() {
		System.out.println("drawing reactangle ");
	}
	
}
class Circle extends Reactangel{

	@Override
	void draw() {
		super.display();
		super.draw();
		System.out.println("drawing circle ");
		
	}
	
}
