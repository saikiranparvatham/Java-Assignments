
public class Triangle {

	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public boolean isEquilateral() {
		if(this.side1==this.side2)
		{
			if(this.side2==this.side3)
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		else
		return false;
	}

	public boolean isRight() {
		if((side1*side1)==(side2*side2)+(side3*side3) || (side2*side2)==(side3*side3)+(side1*side1) || (side3*side3)==(side1*side1)+(side2*side2) )
		return true;
		else
			return false;
	}

	public boolean isScalene() {
		if(side1!=side2 && side2!=side3 && side3!=side1)
		{
			return true;
		}
		else
		return false;
	}

	public boolean isIsosceles() {
		if(side1==side2 || side2==side3 || side3==side1)
		return true;
		else
			return false;
	}
	
	

}
