package assignment3.axisbank;

public class AxisBank {
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		
		BankInfo b = new BankInfo();
		b.deposit();
	}
	public void deposit() {
		System.out.println("Deposit with bank is 3000");
	}
}
