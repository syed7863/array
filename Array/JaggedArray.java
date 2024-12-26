package syed;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int age[][]= new int[2][];
		age[0] = new int[5];
		age[1] = new int [10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=age.length-1; i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
			{
				System.out.println("Enter the age of student belongs to classroom " +i + "student belong to classroom ");
				age[i][j]= s.nextInt();
			}
		}
		
		System.out.println("the age are: ");
		for(int i=0;i<=age.length-1; i++)
		{
			for(int j=0; j<=age[i].length-1; j++)
			{
				System.out.println( age[i][j]);
				
			}
		}

	}

}
