import javax.swing.JOptionPane;


public class wk10_lab2_Dice {
	
	 int Dice_num;
	 int num;
	 int bounces;
	 
	
	public int Throw(int bounces)
	{
		JOptionPane.showMessageDialog(null,"The number of bounces are " + bounces);
		
		
	
		//Min + (int)(Math.random() * ((Max - Min) + 1))
		
		if (bounces == 1 )
		{
			num =  (int)( Math.random()*(6-1)) + 1;
		
		 	
		}
		
		else if (bounces == 2)
		{
			int num1 = (int)( Math.random()*(6-1)) + 1;
			int num2 = (int)( Math.random()*(6-1)) + 1;
			   num = (num1+num2)/2;
			
			
		}
		return num;
	}

	public int Value()
	{
		 Dice_num = num;
		return Dice_num;
		
	}
}
