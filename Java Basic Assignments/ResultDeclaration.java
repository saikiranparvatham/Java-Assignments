package resultDeclaration;

import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks stored in English: ");
		int English=sc.nextInt();
		System.out.println("Enter the marks stored in Science: ");
		int Science=sc.nextInt();
		System.out.println("Enter the marks stored in Social ");
		int Social=sc.nextInt();
		
		if(English>60 && Science>60 && Social>60)
		{
			System.out.println("Passed !");
		}
		else if((English>60 && Science>60)|| (Science>60 && Social>60) || (English>60 && Social>60))
		{
			System.out.println("Promoted !");
		}
		else if(English>60 || Science>60 || Social>60 || (English<60 && Science<60 && Social<60))
		{
			System.out.println("failed");
		}
	}

}
