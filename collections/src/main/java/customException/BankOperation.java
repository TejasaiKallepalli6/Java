package customException;

public class BankOperation {
    public static void main(String[] args) {
        BankingAccount b = new BankingAccount(5000.00);



        try{
            BankingAccount.withDraw(100.50);
            System.out.println(b.getBalance());
        } catch (InvalidWithdrawalException e) {
            throw new RuntimeException(e);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
            throw new RuntimeException(e);

        }


    }
}

