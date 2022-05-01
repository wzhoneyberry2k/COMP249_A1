//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5th 2022
//----------------------------------
package secondPackage;

public class Quadcopter extends Helicopter {
	public int maxFlyingSpeed;

	// default constructor
	public Quadcopter() {
		maxFlyingSpeed = 0;
	}

	// copy constructor
	public Quadcopter(Quadcopter quadcopter) {
		this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
	}

	// parameter constructor
	public Quadcopter(int mFSpeed) {
		this.maxFlyingSpeed = mFSpeed;
	}

	// getter of maxFlyingSpeed
	public int getMaxFlyingSpeed() {
		return this.maxFlyingSpeed;
	}

	// setter of maxFlyingSpeed
	public void setMaxFlyingSpeed(int mFSpeed) {
		this.maxFlyingSpeed = mFSpeed;
	}

	// toString method
	public String toString() {
		return ("This quadcopter was manufacutured by " + super.Brand + " in " + super.creationYear + ". It costs $"
				+ super.price + " with " + super.horsePower + " horsepower. Its max flying speed is "
				+ this.maxFlyingSpeed + ", it has " + super.noOfCylinders + " cylinders and a capacity of "
				+ super.passengerCapacity + " person(s).");
	}

	// equals method
	public boolean equals(Quadcopter quadcopter) {
		return (this.Brand == quadcopter.Brand && this.price == quadcopter.price
				&& this.horsePower == quadcopter.horsePower && this.noOfCylinders == quadcopter.noOfCylinders
				&& this.creationYear == quadcopter.creationYear
				&& this.passengerCapacity == quadcopter.passengerCapacity
				&& this.maxFlyingSpeed == quadcopter.maxFlyingSpeed);
	}
}