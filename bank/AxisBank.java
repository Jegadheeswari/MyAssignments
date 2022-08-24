package bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("standard deposits");
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	
	}
}

