package strategypatterntshirt;

import Interfaces.IPayment;

public class MoneyBankTransfer implements IPayment{

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Money/Bank Tranfer transaction!\n", amount);
        return(true);
    }
}
