package MortagePlanPackage;

public class Calculations {
	//Calculate monthly interest
	//E = U[b(1 + b)^p]/[(1 + b)^p - 1]
	public float calcMortage(float loanAmnt_U, float interest_b, int years_p) {
		int month_p = years_p * 12; //Multiply by 12 to get months
		interest_b = (interest_b / 100) / 12; //Get percentage and divide into monthly interest rate
		float x = 1 + interest_b;
		float zCalc = x;
		
		//Using for loop instead of ^
		for (int i = 1; i < month_p; i++) {
			zCalc = zCalc * x;
		}
		
		//Final calculation of monthly interest payment
		float monthlyPay = loanAmnt_U * ((interest_b * zCalc) / (zCalc-1));
		return monthlyPay;
	}
}