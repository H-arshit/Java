package array;

import java.util.Scanner;

public class WavePrint {
	
	
	public static void print(int arr[][])
	{
		System.out.println(arr[1][2]);
		
		for(int i = 0 ; i < arr[i].length ; i++)
		{
			System.out.println(arr[i].length + "   ;khdfmbfdkjfhjzhgcdkjsd");
			for(int j = 0 ; j < arr.length ; j++ )
			{
				System.out.println(arr[j][i] + "ans");
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int rows = s.nextInt() , col = s.nextInt();
		int arr[][] = new int [rows][col];
		for(int i = 0 ; i < rows  ; i++)
		{
			for(int j = 0 ; j < col ; j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		print(arr);
	}

}
