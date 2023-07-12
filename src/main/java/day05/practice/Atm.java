package day05.practice;

//Change the below class to have setters and Getters and Constructors
class Account {
	protected String accNo;
	protected double balance;

	Account(String accno, double bal) {
		this.accNo = accno;
		this.balance = bal;
	}

	Account() {

	}

//	public String getAccNo() {
//		return accNo;
//	}
//	public void setAccNo(String accNo) {
//		this.accNo = accNo;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

}

//Create an implementation of the below Interface
interface ATM {
	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance(Account a);
}

class Axisatm  implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		if (500.00 >= amount) {  //checking that the min amt for deposit is 500
			account.balance = account.balance + amount;// adding the deposit to ac balance
			System.out.println(amount +"is deposited to the "+account.accNo +"in Icici bank atm");
			return true;

		} else {
			return false;
		}

	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub

		if (account.balance > amount && account.balance > 5000) {//checking that the withdrawn is lesser than the balance and balance is greater than 5000. 
			double currentBal = account.balance - amount - 5;// reducing the amount withdrawn from ac balance with the withdrawn charge
			account.balance = currentBal;
			System.out.println(amount +"is withdrawn from the "+account.accNo +"in Axix bank atm with charge of 5 rs");
			return true;

		} else if (account.balance < 5000) { // exception is thrown when balance is lesser than 5000;
			throw new Exception("The minium balance should be maintained at 5000");// 			
		}else {
			return false;
		} 
	}

	@Override
	public double getBalance(Account account) {
		// TODO Auto-generated method stub

		return account.balance;// return the account balance;

	}

//	double getBalance() {
//		
//	}
}


class ICICIatm  implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		if (500.00 >= amount) { //checking that the min amt for deposit is 500
			account.balance = account.balance + amount;// adding the deposit to ac balance
			System.out.println(amount +"is deposited to the "+account.accNo +"in Icici bank atm");
			return true;

		} else {
			return false;
		}

	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub

		if (account.balance > amount && account.balance > 10000) {//checking that the withdrawn is lesser than the balance and balance is greater than 10000. 
			double currentBal = account.balance - (amount + 10);// reducing the amount withdrawn from ac balance with the withdrawn charge
			account.balance = currentBal;
			System.out.println(amount +"is withdrawn from the "+account.accNo +"in Icici bank atm with charge of 10rs");
			return true;

		} else if (account.balance < 5000) { // exception is thrown when balance is lesser than 10000;
			throw new Exception("The minium balance should be maintained at 10000");// 			
		}else {
			return false;
		} 
	}

	@Override
	public double getBalance(Account account) {
		// TODO Auto-generated method stub

		return account.balance;

	}

//	double getBalance() {
//		
//	}
}


