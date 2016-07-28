package com.ssa.baseball;

import java.util.Scanner;
import java.util.ArrayList;

public class BattingStats 
{
	public static Scanner sc = new Scanner(System.in);
	private static boolean stillComputing = true;
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float sumOne = 0;
		float sluggingPercentage = 0;
		
		//float sumTwo = 0;
		
		ArrayList<Float> noZeros = new ArrayList<>();
		
		System.out.println(" Welcome to the Baseball Statistics Calculator"
				+ "\n We will use the data you input to calculate a player's "
				+ "\n slugging percentage for up to 10 at bats."
				+ "\n Please enter the number of at-bats for a given player"
				+ "\n Valid entries (1-10 )");
		String atBats = sc.nextLine();
		
		int atBatsAsNo = Integer.parseInt(atBats);
		
		if(atBatsAsNo > 0)
		{	
		for (int i = 0; i < atBatsAsNo; i++)
		{
			System.out.println("How many bases were taken at-bat?"
					+ "\t Out = 0"
					+ "\t Single = 1"
					+ "\t Double = 2"
					+ "\t Triple = 3"
					+ "\t Homerun = 4");
			String basesTaken = sc.nextLine();
			float basesTakenAsNo = Float.parseFloat(basesTaken);
			
			noZeros.add(basesTakenAsNo);
		}
		System.out.println(noZeros);
		
		for(int i = 0; i < noZeros.size(); i++)
		{
			sumOne += noZeros.get(i);
		}
		System.out.println("Total Bases: " + sumOne);
		System.out.println("Total at bats: " + atBatsAsNo);
		
	    sluggingPercentage = sumOne / atBatsAsNo;
        System.out.println("slugging %: " + sluggingPercentage );	
	    }
		else
		System.out.println("Riding the bench again Flaherty?");
	    }
}
