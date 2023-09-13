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
		int totalSimulations = 0;
		
		for (int days = 0; days < 500; days++)
			{double newstartAmount = startAmount;
			while ((startAmount < winLimit) && (startAmount > 0))
				
			{
			
			if (Math.random() > (1.00 - winChance))
			{newstartAmount++;
			}
			
			else
			{newstartAmount--;
			}
		
			totalSimulatio3ns++;
			System.out.println("You played uhiuhiuh" + totalSimulations + " Times");
		
		startAmount = startAmount;
			startAmount--;
			
			
		}
		}
		
	}

}
