package lab;

import javax.swing.JOptionPane;

public class DollarGame {

	public static void main(String[] args) {
		
		int numberOfCoins = 6;
		double sum = 0;
	
		for(int i=0; i < numberOfCoins; i++){
			
			String inputCoin = JOptionPane.showInputDialog("Enter one of the coin values: 0.01, 0.05, 0.10, and 0.25.");
			double coinValue = Double.parseDouble(inputCoin);

			while(coinValue != 0.01 && coinValue != 0.05 && coinValue != 0.10 && coinValue != 0.25){
				inputCoin = JOptionPane.showInputDialog("Invalid, entry. Please enter a value of the coins listed: 0.01, 0.05, 0.10, and 0.25.");
				coinValue = Double.parseDouble(inputCoin);
			}
	
			sum = sum + coinValue;
		}

		if(sum == 1){
			JOptionPane.showMessageDialog(null, "Your total value is exactly $1! Congratulations, you win!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your total value does not equal $1. Your total is $" + sum);
		}
		
		System.exit(0);
	}

}
