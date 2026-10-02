package OopsConcepts;

import java.sql.SQLOutput;

public class Encap {
    public static void main(String[] args) {
        BankBlnc j = new BankBlnc();
        j.addpaisa(500);
        System.out.println(j.showbalance());
        j.withdraw(1000);
        System.out.println(j.showbalance());
    }
}
class BankBlnc{
    private double balance=5000;

    void addpaisa(double amount){
        balance+=amount;
    }

    void withdraw(double amount){
        if(amount<=balance) {
            balance -= amount;
        }
        else{System.out.println("Gareeb");}
    }

    double showbalance(){
        return balance;
    }

}