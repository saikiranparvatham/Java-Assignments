
public class DiscountCalculation {

	public double CalculateDiscount(double newItem) {
		
		double discount=0.35*newItem;
		double newItemPrice=(newItem-discount);
		System.out.println(newItemPrice);
		return newItemPrice;
	}

}
