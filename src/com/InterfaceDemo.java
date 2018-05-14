//The purpose of this program is to demonstrate the use of interfaces
//Also we are solving the problem of multiple inheritance in java. With interfaces we can implement or inherit several interfaces

package com;

public class InterfaceDemo {

	public static void main(String[] args) {

		Areas area1 = new Areas(2,4.2);
		
		System.out.println("The area of my circle is: "+area1.calculateCircleArea());
		System.out.println("The area of my cube is: "+area1.calcualteCubeArea());
	


	}

}
