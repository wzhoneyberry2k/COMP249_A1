//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package thirdPackage;

public class Multirotor extends secondPackage.Helicopter {
	public int noOfRotors;

	// default constructor
	public Multirotor() {
		noOfRotors = 0;
	}

	// copy constructor
	public Multirotor(Multirotor multirotor) {
		super(multirotor.noOfCylinders, multirotor.creationYear, multirotor.passengerCapacity);
		this.noOfRotors = multirotor.noOfRotors;
	}

	// parameter constructor
	public Multirotor(int nORotors) {
		this.noOfRotors = nORotors;
	}

	// getter noOfRotors
	public int getNoOfRotors() {
		return this.noOfRotors;
	}

	// setter noOfRotors
	public void setNoOfRotors(int nORotors) {
		this.noOfRotors = nORotors;
	}

	// toString method
	public String toString() {
		return ("This Multirotor was manufacutured by " + super.Brand + " in " + super.creationYear + ". It costs $"
				+ super.price + " and has " + super.horsePower + " horsepower. " + "It has " + super.noOfCylinders
				+ " cylinders, " + this.noOfRotors + " rotors and a capacity of " + super.passengerCapacity
				+ " person(s)");
	}

	public boolean equals(Multirotor multirotor) {
		return (this.Brand == multirotor.Brand && this.price == multirotor.price
				&& this.horsePower == multirotor.horsePower && this.noOfCylinders == multirotor.noOfCylinders
				&& this.creationYear == multirotor.creationYear
				&& this.passengerCapacity == multirotor.passengerCapacity && this.noOfRotors == multirotor.noOfRotors);
	}
}