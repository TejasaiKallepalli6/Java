package customException;

public class BankOperation {
    public static void main(String[] args) {

        TestCustomException1 t = new TestCustomException1();
        try{
            t.withDraw(100.50);
        } catch (InvalidWithdrawalException e) {
            throw new RuntimeException(e);
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }


    }
}

