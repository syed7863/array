package syed;
import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int age[][][] = new int[2][2][5];
		Scanner s= new Scanner(System.in);
		for(int i=0; i<=age.length-1; i++)
		{
			for(int j=0; j<=age[i].length-1;j++)
			{
				for(int k=0; k<=age[i][j].length-1;k++)
				{
					
					System.out.println("Enter the age of student " + i +  " belongs to classroom" + j + " in college " + i);
					age[i][j][k]=s.nextInt();
				}
				
			}
		}
		for(int i=0; i<=age.length-1; i++)
		{
			for(int j=0; j<=age[i].length-1;j++)
			{
				for(int k=0; k<=age[i][j].length-1;k++)
				{
					
					System.out.println(age[i][j][k]);
					
				}
				
			}
		}
		
		
				
		

	}

}
