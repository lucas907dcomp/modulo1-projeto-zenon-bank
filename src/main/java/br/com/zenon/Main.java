package br.com.zenon;
import java.math.BigDecimal;

public class Main {

    void main(){
        var transaction1 = new Transaction(1, TransactionType.PAYMENT, new BigDecimal("9839.64"),
                new TransactionCostumer("C1231006815", new BigDecimal("170136.0"), new BigDecimal("160296.36")),
                new TransactionCostumer("M1979787155", new BigDecimal("0.0"),new BigDecimal("0.0")),
                0,0);

        var transaction2 = new Transaction(743,TransactionType.CASH_OUT, new BigDecimal("9839.64"),
                new TransactionCostumer("C1231006815",new BigDecimal("170136.0"), new BigDecimal("160296.36")),
                new TransactionCostumer("M1979787155",new BigDecimal("0.0"),new BigDecimal("0.0"))
                ,0,0);

        IO.println(transaction2);
    }
}