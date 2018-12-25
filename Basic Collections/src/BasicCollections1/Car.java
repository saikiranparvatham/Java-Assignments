
package BasicCollections1;
public class Car implements Comparable<Car> {								
	String make;
	String model;									//Instance fields
	int year; 
	int price;
	
	public Car(String make, String model, int year, int price) {
		super();
		this.make = make;
		this.model = model;							//Constructor
		this.year = year;
		this.price = price;
	}

	/**
	 * @return the make
	 */
	public String getMake() {							
		return make;
	}

			
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}



	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}



	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}



	@Override	
	public int hashCode() {									//Method Overriding hashcode
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {						//Method overriding equals with our own requirement of comparison
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		
		
		return (this.getMake()==((Car)obj).getMake()) && (this.getModel() == ((Car)obj).getModel());
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}

	@Override										//Comparator method which overrides and implements our own sorting requirement
	public int compareTo(Car object) {
		return getMake().compareTo((object).getMake());
		
	}
	
	
	
	
}
