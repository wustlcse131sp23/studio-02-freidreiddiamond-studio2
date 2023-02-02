package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner in = new Scanner(System.in);
	System.out.println("What's the start amount?");
	double startAmount = in.nextDouble();
	System.out.println("What's the win chance?");
	double winChance = in.nextDouble();
	System.out.println("What's the win limit?");
	double winLimit = in.nextDouble();
	double totalPlays = 0;
	System.out.println("What's the total simulations you want to play?");
	double totalSimulations = in.nextDouble();
	double currentAmount = 7;
	int timesLost = 0; 
	double expectedRuin = 0;
	

			
	for (int i = 1; i <= totalSimulations; i++)
	{
		System.out.println("Start amount: " + startAmount);
		currentAmount = startAmount;
		int dailyPlays = 0;
		
	while (currentAmount > 0 && currentAmount < winLimit)
	{
		if (Math.random() < winChance)
		{
			currentAmount = currentAmount + 1;
			totalPlays = totalPlays + 1;
			dailyPlays = dailyPlays +1;
	
		}
		else
		{
			currentAmount = currentAmount - 1;
			totalPlays = totalPlays + 1;
			dailyPlays = dailyPlays +1;
		}
	}
	System.out.println("It's day: " + i);
	System.out.println("Total number of plays: " + dailyPlays);
	
	if (currentAmount == winLimit)
	{
		System.out.println("WIN");
		System.out.println(" ");
	}
	else
	{
		
		System.out.println("LOST");
		System.out.println(" ");
		timesLost = timesLost + 1;
	}
	}
	 System.out.println("Total percentage lost: " + timesLost / totalSimulations * 100 + "%");
	
	if (winChance == 0.5)
			{
		expectedRuin = 1-(startAmount / winLimit);
			}
		
		else
		{
			double a = (1 - winChance) / (winChance);
			expectedRuin = ((Math.pow(a, startAmount) - Math.pow(a, winLimit)) / 
					(1 - Math.pow(a, winLimit)));
					
		}
		
	System.out.println("Expected ruin rate: " + expectedRuin);

			}
	}
		

