package BasicCollections1;

public class Laptop {

	public String company;
	public String model;									//Instance fields
	public String operatingSystem;
	public String processor;
	
	public Laptop(String companyName,String modelName,String operatingSystemName,String processorName)
	{
		this.company = companyName;							//Constructor which Initializes the fields
		this.model = modelName;
		this.operatingSystem = operatingSystemName;
		this.processor = processorName;
 	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {				
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;								//Overriding equals method with our own logic of comparision
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		
		return (this.getCompany()==((Laptop) obj).getCompany()) && (this.getModel()==((Laptop) obj).getModel());
	}
	
	
	
	
}
