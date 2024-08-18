//Bank System

class Account {
  final String accNo;
  private String name;
  private String address;
  private String phNo;
  private String dob;
  private double balance;
  
  public Account(String accNo, String name, String address, String phNo, String dob, double balance) {
    this.accNo = accNo;
    this.name = name;
    this.address = address;
    this.phNo = phNo;
    this.dob = dob;
    this.balance = balance;
}

  public String getAccNo() {
    return accNo;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getPhNo() {
    return phNo;
  }

  public String getDob() {
    return dob;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhNo(String phNo) {
    this.phNo = phNo;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void close() {
    System.out.println("Account is Closed.");
  }

  @Override
  public String toString() {
    return "\nAccount No: "+accNo+"\nName: "+name+"\nAddress: "+address+"\nPhone No: "+phNo+"\nDOB: "+dob+"\nBalance: "+balance;

  }

}
class SavingsAccount extends Account {
  
  public SavingsAccount(String accNo, String name, String address, String phNo, String dob, double balance) {
    super( accNo,  name,  address,  phNo,  dob,  balance);
}

public void deposit(double amount) {
  setBalance(getBalance()+amount);
  System.out.println("Amount deposited:" + amount);

}

public void withdraw(double amount) {
  if(amount<=getBalance()){
    setBalance(getBalance()-amount);
    System.out.println("Withdrawl Amount:"+amount);
  }
  else{
  System.out.println("Insufficient Balance.");
  }
}

public void fixedDeposit(double amount , int tenure) {
  System.out.println("Fixed Amount "+amount+" for "+tenure+" Years.");
}

public void liquidDate() {
  System.out.println("Amount LiquidDate");
}

}

class LoanAccount extends Account {
  public LoanAccount(String accNo, String name, String address, String phNo, String dob, double balance) {
    super(accNo, name, address, phNo, dob, balance);
  }

  public void payEmi(double amount) {
    setBalance(getBalance()-amount);
    System.out.println("EMI Paid:" + amount);
  }

  public void topUpLoan(double amount) {
    setBalance(getBalance()+amount);
    System.out.println("Loan Topped Up by:"+amount);
  }

  public void rePayment(double amount) {
    setBalance(getBalance()-amount);
    System.out.println("Amount Repayed: "+amount);
  }

}

public class BankSystem {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount("101", "Vikas Singh", "Mumbai", "8544785540", "16-05-2002", 2000.00);

    System.out.println("Details is:"+sa);
    System.out.println();

    sa.deposit(1000);
    sa.withdraw(1500);
    sa.fixedDeposit(5000, 3);
    sa.liquidDate();
    System.out.println("Updated Balance: "+sa.getBalance());
    sa.close();
    System.out.println("Updated Balance: "+sa.getBalance());
    System.out.println();

    LoanAccount la = new LoanAccount("102", "Rahul Singh", "Delhi", "7894561230", "01-01-2000", 2000);

    System.out.println("Account Details : "+la);
    System.out.println();

    la.payEmi(500);
    la.topUpLoan(1500);
    la.rePayment(800);
    System.out.println("Updated Balance: "+la.getBalance());
    la.close();


  }

  

}
