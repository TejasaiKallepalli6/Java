package customException;
import customException.*;
public class TestCustomException1 {
    static BankingAccount b = new BankingAccount();

    // method to check the age
    static void withDraw(double amount) throws InvalidWithdrawalException, InsufficientFundsException {
        if (amount < b.getBalance()) {

            // throw an object of user defined exception
            throw new InvalidWithdrawalException("Attempting to withdraw a negative amount.");
        } else if (amount > b.getBalance()) {

            throw new InsufficientFundsException("Attempting to withdraw more money than the account balance.");
        }else {
            System.out.println("Successful withdrawal.");
        }
    }
    }

