package com.pingwinno;

import java.math.BigInteger;

public class BracketPairsCounter {
    private int pairsNum;

    public BracketPairsCounter(int pairsNum) {
        this.pairsNum = pairsNum;
    }

    private static BigInteger generatorCatalanNumber(int n) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger reminder = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger iBig = BigInteger.valueOf(i);
            //Calculate Catalan number. Use BigInteger for really big numbers of brackets ( > 2000).
            //Calculates can take more time than you expect on numbers > 100000.
            reminder = reminder.multiply(two.multiply(two.multiply(iBig).add(BigInteger.ONE))).divide(iBig.add(two));
        }
        return reminder;
    }

    //count pairs num
    public String count() {
        return generatorCatalanNumber(pairsNum).toString();
    }

}



