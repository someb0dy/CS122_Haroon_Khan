import java.util.Scanner;

import javax.swing.JOptionPane;

public class wk7_HW {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		
		//int tries = Integer.parseInt(JOptionPane.showInputDialog("How many times would you like to play the game?"));
		int tries =0;
		
		
		int computerNum;
		
		int [] userWins = new int [100];
		int [] compWins = new int [100]; 
		
		
		int [] userChoice = new int [100];
		int [] compChoice = new int [100];
		
		int choice = 0;
		int scorecard;
		
	//	int choice = 0;
		
		while (choice == 0){
		
			tries++;
			
		
			
		computerNum = 0 + (int)(Math.random()*10);		
	
	
		int num = Integer.parseInt(JOptionPane.showInputDialog("Guess a Number!"));
		userChoice[tries-1] = num;
		compChoice[tries -1] = computerNum;
			
	//	System.out.println(computerNum);
		
		JOptionPane.showMessageDialog(null,"The number is " + computerNum);
		
		
		if (computerNum < num)
		{	
			JOptionPane.showMessageDialog(null,"Your guess is too large!");
			userWins[tries -1]=0;
			compWins[tries -1]=1;
		}
	  
		else if (computerNum > num)
		{	
			JOptionPane.showMessageDialog(null,"Your guess is too small!");
			userWins[tries -1]=0;
			compWins[tries -1]=1;
		}
		
		else
		{	
			JOptionPane.showMessageDialog(null,"You got it! Good guess!");
			userWins[tries -1]=1;
			compWins[tries -1]=0;
		}
		
		tries++;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to keep playing? 0 for yes, 1 for no"));
		
		scorecard =  Integer.parseInt(JOptionPane.showInputDialog("Do you want to see the scorecard? 0 for yes, 1 for no"));
		
			while (scorecard == 0)
			{	
				int wins=0;
				int loses=0;
				
				for (int i : userWins)
				{	
					wins +=i; 
				}
				
				for (int i : compWins)
				{	
					loses +=i; 
				}
				
				JOptionPane.showMessageDialog(null, "You correctly guessed the number " + wins + 
						" many times. And you had " + loses + " wrong guesses!");
				
				JOptionPane.showMessageDialog(null, "The following are your guesses and the computers number");
				for(int i =0; i<tries; i++)
				{	
					
					JOptionPane.showMessageDialog(null, "Your number was: " + userChoice[i] + " The actual number was: " + compChoice[i]);
				}
				
				scorecard =1;
			}
	
		}
	  }
	

}

//Please fix the extra  0 0 display, and also use 1 for yes and 0 for no
