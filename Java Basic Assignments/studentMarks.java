import java.util.*;
class StudentMarks
{
	public static void main(String[] args)
	{
		int[][] studentMarks = new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<studentMarks.length;i++)
			for(int j=0;j<studentMarks[0].length;j++)
			{	
				
				System.out.println("enter the marks of student number "+(i+1)+ "and subject"+(j+1));
				studentMarks[i][j]=sc.nextInt();
			}
			int totalMarksA=0;
				for(int l=0;l<3;l++)
				{
					totalMarksA=totalMarksA+studentMarks[l][0];
					
				}
					int averageOfA=totalMarksA/3;
				System.out.println("The total marks in subject A is"+totalMarksA);
				System.out.println("THe average marks in subject A is "+averageOfA);

			int totalMarksOfB=0;
			for(int l=0;l<3;l++)
				{
					totalMarksOfB=totalMarksOfB+studentMarks[l][1];
				}
				int averageOfB=totalMarksOfB/3;
				System.out.println("\nThe total marks in subject B is"+totalMarksOfB);
				System.out.println("THe average marks in subject B is "+averageOfB);
				
			int totalMarksOfC=0;
			for(int l=0;l<3;l++)
				{
					totalMarksOfC=totalMarksOfC+studentMarks[l][2];
				}
				int averageOfC=totalMarksOfC/3;
				System.out.println("\nThe total marks in subject C is"+totalMarksOfC);
				System.out.println("THe average marks in subject C is "+averageOfC);

				int totalMarks1=0;
			for(int i=0;i<3;i++)
				totalMarks1=totalMarks1+studentMarks[0][i];
				int averageOf1=totalMarks1/3;
				System.out.println("\nThe total marks of student 1 is "+totalMarks1+" and average is "+averageOf1); 
				
				int totalMarks2=0;
			for(int i=0;i<3;i++)
				totalMarks2=totalMarks2+studentMarks[1][i];
				int averageOf2=totalMarks2/3;
				System.out.println("\nThe total marks of student 2 is "+totalMarks2+" and average is "+averageOf2); 

				int totalMarks3=0;
			for(int i=0;i<3;i++)
				totalMarks3=totalMarks3+studentMarks[2][i];
				int averageOf3=totalMarks3/3;
				System.out.println("\nThe total marks of student 3 is "+totalMarks3+" and average is "+averageOf3); 
				

	}
}