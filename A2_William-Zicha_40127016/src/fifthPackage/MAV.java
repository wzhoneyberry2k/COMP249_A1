//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package fifthPackage;

import fourthPackage.UAV;

public class MAV extends UAV {
	public String model;
	public double size;

	public MAV() {
		this.size = 0;
		this.model = " ";
	}

	public MAV(double size, String model) {
		this.size = size;
		this.model = model;
	}

	public MAV(MAV mav) {
		super(mav.weight, mav.price);
		this.size = mav.size;
		this.model = mav.model;
	}

	public double getSize() {
		return this.size;
	}

	// Getter method
	public String getModel() {
		return this.model;
	}

	// Setter method
	public void setSize(double size) {
		this.size = size;
	}

	// Setter method
	public void setModel(String model) {
		this.model = model;
	}

	// toString method
	public String toString() {
		return "The weight of this MAV is " + super.weight + " and the price of this MAV is $" + super.price
				+ ". The model of this MAV is " + this.model + " and the size of this MAV is " + this.size;
	}

	// equals method
	public boolean equals(MAV mav) {
		return (this.price == mav.price && this.weight == mav.price && this.size == mav.size
				&& this.model == mav.model);
	}

}