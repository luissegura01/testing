//The purpose of this program is to demonstrate the use of interfaces
//Also we are solving the problem of multiple inheritance in java. With interfaces we can implement or inherit several interfaces

package com;

public class Areas implements MyInterface, MyInterface2{
	private int edge;
	private double radius;
	
	
	

	public Areas(int edge, double radius) {
		this.edge = edge;
		this.radius = radius;
	}
	
	

	public int getEdge() {
		return edge;
	}



	public void setEdge(int edge) {
		this.edge = edge;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	//
	@Override
	public double calculateCircleArea() {
		// TODO Auto-generated method stub
		return PI*(this.radius*this.radius);
	}

	@Override
	public double calcualteCubeArea() {
		// TODO Auto-generated method stub
		return FIXEDVALUE*(this.edge*this.edge);
	}
	

}
