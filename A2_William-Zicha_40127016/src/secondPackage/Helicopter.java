//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package secondPackage;

public class Helicopter extends firstPackage.Airplane {
	public int noOfCylinders = 0;
	public int creationYear = 0;
	public int passengerCapacity = 0;

	// default constructor
	public Helicopter() {
		this.noOfCylinders = 0;
		this.creationYear = 0;
		this.passengerCapacity = 0;
	}

	// copy constructor
	public Helicopter(Helicopter helicopter) {
		this.noOfCylinders = helicopter.noOfCylinders;
		this.creationYear = helicopter.creationYear;
		this.passengerCapacity = helicopter.passengerCapacity;
	}

	// parameter constructor
	public Helicopter(int nOCylinders, int cYear, int pCapacity) {
		this.noOfCylinders = nOCylinders;
		this.creationYear = cYear;
		this.passengerCapacity = pCapacity;
	}

	// getter noOfCylinders
	public int getNoOfCylinders() {
		return this.noOfCylinders;
	}

	// getter creationYear
	public int getCreationYear() {
		return this.creationYear;
	}

	// getter passengerCapacity
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}

	// setter noOfCylinders
	public void setNoOfCylinders(int nOCylinders) {
		this.noOfCylinders = nOCylinders;
	}

	// setter creationYear
	public void setCreationYear(int cYear) {
		this.creationYear = cYear;
	}

	// setter passengerCapacity
	public void setPassengerCapacity(int pCapacity) {
		this.passengerCapacity = pCapacity;
	}

	// toString method
	public String toString() {
		return ("This Helicopter was manufacutured by " + super.Brand + " in " + this.creationYear + ". It costs $"
				+ super.price + " and has " + super.horsePower + " horsepower. " + "It has " + this.noOfCylinders
				+ " cylinders and a capacity of " + this.passengerCapacity) + " person(s)";
	}

	// equals method
	public boolean equals(Helicopter helicopter) {
		return (this.Brand == helicopter.Brand && this.price == helicopter.price
				&& this.horsePower == helicopter.horsePower && this.noOfCylinders == helicopter.noOfCylinders
				&& this.creationYear == helicopter.creationYear
				&& this.passengerCapacity == helicopter.passengerCapacity);
	}
}