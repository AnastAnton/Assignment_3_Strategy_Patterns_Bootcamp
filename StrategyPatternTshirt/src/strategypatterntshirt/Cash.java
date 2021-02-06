package strategypatterntshirt;

import Interfaces.IPayment;

public class Cash implements IPayment{

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made via Cash transaction!\n", amount);
        return(true);
    }
}
