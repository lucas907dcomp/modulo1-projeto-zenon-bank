import br.com.zenon.fraud.Transaction;

public static void main(String[] args) {
    Transaction transaction1 = new Transaction(1,"PAYMENT", new BigDecimal("9839.64"), "C1231006815",new BigDecimal("170136.0"),
            new BigDecimal("160296.36"),"M1979787155",new BigDecimal("0.0"),new BigDecimal("0.0"),0,0);
    Transaction transaction2 = new Transaction(743,"CASH_OUT", new BigDecimal("9839.64"), "C1231006815",new BigDecimal("170136.0"),
            new BigDecimal("160296.36"),"M1979787155",new BigDecimal("0.0"),new BigDecimal("0.0"),0,0);
}
