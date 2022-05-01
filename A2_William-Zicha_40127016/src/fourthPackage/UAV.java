//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package fourthPackage;

public class UAV {
	public double weight;
	public double price;

	// default constructor
	public UAV() {
		this.weight = 0;
		this.price = 0;
	}

	// parameter constructor
	public UAV(double weight, double price) {
		this.price = price;
		this.weight = weight;
	}

	// copy constructor
	public UAV(UAV uav) {
		this.price = uav.price;
		this.weight = uav.weight;
	}

	// Getter method
	public double getWeight() {
		return this.weight;
	}

	// Getter method
	public double getPrice() {
		return this.price;
	}

	// Setter method
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Setter method
	public void setPrice(double price) {
		this.price = price;
	}

	// toString method
	public String toString() {
		return ("The weight of this UAV is " + this.weight + " and its price is $" + this.price);
	}

	// equals method
	public boolean equals(UAV uav) {
		return (this.price == uav.price && this.weight == uav.weight);
	}

}
