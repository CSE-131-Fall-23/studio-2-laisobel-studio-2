package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		double startAmount = in.nextDouble();
		
		System.out.println("Win Chance (between 0 & 1): ");
		double winChance = in.nextDouble();
		
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble(); 
		
		int totalDays = 0;
		int totalSimulations = 0;
		while (totalDays < 500)
		{
		double newStartAmount = startAmount;
		while ((newStartAmount < winLimit) && (newStartAmount > 0))
			{
				if (Math.random() > (1.00 - winChance))
					{
					newStartAmount++;
					totalSimulations++;
					}
					
				else
					{
					newStartAmount--;
					totalSimulations++;
					}
			}
		
		totalDays++;
		
		if (newStartAmount == 0)
			{
			System.out.println("ON DAY " + totalDays + " YOU LOSE AFTER PLAYING " + totalSimulations + "TIMES");
			totalSimulations = 0;
			}
		else 
			{
			System.out.println("ON DAY " + totalDays + " YOU WIN AFTER PLAYING " + totalSimulations + " TIMES");
			totalSimulations = 0;
			}
		
		
		}
	}
}
				
