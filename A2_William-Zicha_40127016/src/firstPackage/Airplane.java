//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package firstPackage;

public class Airplane {
	public String Brand;
	public double price;
	public int horsePower;

	// default constructor
	public Airplane() {
		this.Brand = " ";
		this.price = 0.0;
		this.horsePower = 0;
	}

	// copy constructor
	public Airplane(Airplane airplane) {
		this.Brand = airplane.Brand;
		this.price = airplane.price;
		this.horsePower = airplane.horsePower;
	}

	// parameter constructor
	public Airplane(String B, double p, int h) {
		this.Brand = B;
		this.price = p;
		this.horsePower = h;
	}

	// getter of brand
	public String getBrand() {
		return this.Brand;
	}

	// getter of price
	public double getPrice() {
		return this.price;
	}

	// getter of horsePower
	public int getHorsepower() {
		return this.horsePower;
	}

	// setter of brand
	public void setBrand(String B) {
		this.Brand = B;
	}

	// setter of price
	public void setPrice(double p) {
		this.price = p;
	}

	// setter of horsePower
	public void setHorsepower(int h) {
		this.horsePower = h;
	}

	// toString method
	public String toString() {
		return ("This Airplane was manufacutured by " + this.Brand + ". It costs $" + this.price + " with "
				+ this.horsePower + " horsepower");
	}

	// equals method
	public boolean equals(Airplane airplane) {
		return (this.Brand == airplane.Brand && this.price == airplane.price && this.horsePower == airplane.horsePower);
	}
}