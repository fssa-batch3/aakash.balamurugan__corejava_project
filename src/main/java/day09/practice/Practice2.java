package day09.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Account implements Comparable<Account> {
	private int id;
	private String name;
	private LocalDate date;
	
	public Account(int id, String name, LocalDate date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public LocalDate getDate() {
		return date;
	}

	@Override
	public int compareTo(Account obj) {
		if (this.date == obj.getDate()) {
			return 0;
		} else {
			if (this.date.isBefore( obj.getDate())) {
				return -1;
			} else {
				return 1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}
	@Override
	public String toString() {
		return "Account [id" + id + ", name=" + name + ", date=" + date + "]";
	}
}
public class Practice2 {
	public static void main(String[] args) {
    
		Account acct1 = new Account(1, "Naresh", LocalDate.of(2023,2,22));
	
		Account acct2 = new Account(2, "Arun", LocalDate.of(2023,2,24));
	
		Account acct3 = new Account(4, "Karthik", LocalDate.of(2023,2,23));
		List<Account> list = new ArrayList<Account>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);
		Collections.sort(list);
		
		//Printing numbers sorted by balance
		System.out.println(list);
	}
}
