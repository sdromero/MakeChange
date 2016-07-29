package change;

// Comment
public class CashRegister {
	private static final int QUARTER_AMOUNT = 25;
	private static final int DIME_AMOUNT = 10;
	private static final int NICKEL_AMOUNT = 5;
	private static final int PENNY_AMOUNT = 1;
	
	public static void main(String[] args) {
		float amountTendered = 1.00F;
		float cost = .07F;
		int amount = (int)((amountTendered - cost) * 100);
		System.out.println("Amount: " + amount);
		
		amount = change(amount, QUARTER_AMOUNT, "quarters");
		amount = change(amount, DIME_AMOUNT, "dimes");
		amount = change(amount, NICKEL_AMOUNT, "nickels");
		amount = change(amount, PENNY_AMOUNT, "pennies");
	}
	
	public static int change(int amount, int denomination, String denominationName) {
		int q = amount / denomination;
		int remainder = amount % denomination;
		System.out.println(q + " " + denominationName);
		return remainder;
		
	}

}
