package Encapsulation;

public class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
}

class Main{
    public static void main(String[] args){
        BankAccount myBalance = new BankAccount();
        myBalance.setBalance(123.42);
        System.out.println(myBalance.getBalance());

        double deposit = 0;
        deposit += myBalance.getBalance();
        System.out.println(deposit);

        
    }
}
