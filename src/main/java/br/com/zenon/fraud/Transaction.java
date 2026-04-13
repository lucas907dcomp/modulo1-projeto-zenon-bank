package br.com.zenon.fraud;

import java.math.BigDecimal;

public record Transaction(
        int step,
        String type,
        BigDecimal amount,
        String nameOrig,
        BigDecimal oldBalanceOrig,
        BigDecimal newBalanceOrig,
        String nameDest,
        BigDecimal oldBalanceDest,
        BigDecimal newBalanceDest,
        int isFraud,
        int isFlaggedFraud ){}


