//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package fifthPackage;

import fourthPackage.UAV;

public class AgriculturalDrone extends UAV {
	public String brand;
	public int carryCapacity;

	// default constructor
	public AgriculturalDrone() {

		this.brand = " ";
		this.carryCapacity = 0;
	}

	// parameter constructor
	public AgriculturalDrone(int carryCapacity, String brand) {

		this.brand = brand;

		this.carryCapacity = carryCapacity;
	}

	// copy constructor
	public AgriculturalDrone(AgriculturalDrone agDrone) {
		super(agDrone.weight, agDrone.price);
		this.brand = agDrone.brand;
		this.carryCapacity = agDrone.carryCapacity;

	}

	// Getter method
	public String getBrand() {
		return this.brand;
	}

	// Getter method
	public int getCarryCapacity() {
		return this.carryCapacity;
	}

	// Setter method
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// Setter method
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}

	// toString method
	public String toString() {
		return "The weight of this Agricultural Drone is " + super.weight + " and its price is $" + super.price
				+ ". The brand of the Agricultural Drone is " + this.brand + " and can carry " + this.carryCapacity
				+ " person(s).";
	}

	// equals method
	public boolean equals(AgriculturalDrone agdrone) {
		return (this.price == agdrone.price && this.weight == agdrone.price && this.brand == agdrone.brand
				&& this.carryCapacity == agdrone.carryCapacity);
	}

}