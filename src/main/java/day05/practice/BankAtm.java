package day05.practice;

public class BankAtm {

	public static void main(String[] args) {
		Account a = new Account("9830982376", 5001);
		ATM bank = new Axisatm();

		try {
			bank.deposit(a, 500);
			bank.withdraw(a, 1000.00);
			System.out.println(bank.getBalance(a));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		ATM icicatm = new ICICIatm();
		Account b = new Account("9830982376", 10001);
		try {
			icicatm.deposit(b, 500);
			icicatm.withdraw(b, 1000.00);
			System.out.println(icicatm.getBalance(b));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}
}
