// lets create one account class then iherit Account class in saving acoount and loan account class


package section12_Inheritence;

class Account{
	
	public String accountNo;
	public String name;
	public String address;
	public String phonno;
	public String dob;
	public long balance;
	
	public Account(String accno, String n, String add, String phone, String dob) {
		accountNo=accno;
		name=n;
		address=add;
		this.phonno=phone;
		balance=0;	
	}
	public String getaccountNo() {
		return accountNo ;
		
	}
	public String getaddress() {
		return address;
	}
	public String getphonno() {
		return phonno;
	}
	public long getbalance() {
		return balance;
	}
	
	public void setphonno(String phone) {
		
			this.phonno =phone;	
	}
	
	public void setaddress(String add) {
		this.address=add;
		
	}
	
}

class SavingsAccount extends Account
{
    public SavingsAccount(String accno, String n, String add, String phone, String dob) {
		super(accno, n, add, phone, dob);
		// TODO Auto-generated constructor stub
	}
	public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String accno, String n, String add, String phone, String dob) {
		super(accno, n, add, phone, dob);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class Lect_123_StudentChallange {
	public static void main(String[] args) {
		

	}

}
