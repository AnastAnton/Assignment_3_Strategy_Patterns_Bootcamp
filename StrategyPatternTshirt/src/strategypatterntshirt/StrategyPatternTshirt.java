package strategypatterntshirt;

import Interfaces.IPayment;
import models.Color;
import models.Fabric;
import models.Size;
import models.TShirt;

public class StrategyPatternTshirt {

    public static void main(String[] args) {
        TShirt tShirt; 
        StrategyPatternTshirt myMainClass = new StrategyPatternTshirt();

        IPayment payment;
        int i= 0;

        for (Color color : Color.values()) {
            for (Size size : Size.values()) {
                for (Fabric fabric : Fabric.values()) {
                    tShirt = new TShirt("MARCO POLO", color, size, fabric);
                    System.out.println(++i + ")");

                    //CreditDebitCard
                    payment = new CreditDebitCard();
                    myMainClass.makeAnOrder(tShirt, payment);
                    System.out.println("");
                    
                    //MoneyBankTransfer
                    payment = new MoneyBankTransfer();
                    myMainClass.makeAnOrder(tShirt, payment);
                    System.out.println("");
                    
                    //Cash
                    payment = new Cash();
                    myMainClass.makeAnOrder(tShirt, payment);
                    
                    System.out.println("-------------------------------------");
                }
            }
        }

    }

    public void makeAnOrder(TShirt tShirt, IPayment payment) {
        System.out.println(tShirt);
        if (payment.getClass().getName().equals("strategypatterntshirt.CreditDebitCard")) {
            payment.pay(tShirt.getFabric().getUnitPrice() + 5.0f);
        }
        if (payment.getClass().getName().equals("strategypatterntshirt.MoneyBankTransfer")) {
            payment.pay(tShirt.getFabric().getUnitPrice() + 3.0f);
        }
        if (payment.getClass().getName().equals("strategypatterntshirt.Cash")) {
            payment.pay(tShirt.getFabric().getUnitPrice() + 2.0f);
        }
    }
}
