//The purpose of this program is to demonstrate the use of interfaces
//Also we are solving the problem of multiple inheritance in java. With interfaces we can implement or inherit several interfaces

package com;

public interface MyInterface {
	
	//only public, final, and static fields are permitted in interfaces
	 double PI = 3.14;
	 
	 
	 
	 //Interfaces contain only abstract methods that need to be overridden in classes implementing the interface
	 //The public abstract keywords are not needed since by default they are already public abstract in the interfaces
	 public abstract double calculateCircleArea();
	 

}
