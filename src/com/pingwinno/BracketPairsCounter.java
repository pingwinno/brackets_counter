package com.pingwinno;

import java.math.BigInteger;
import java.util.ArrayList;

public class BracketPairsCounter {

    private ArrayList bracketsCases = new ArrayList();
    private int pairsNum;

    //Generate *count* brackets pairs
    public BracketPairsCounter(int pairsNum) {
        this.pairsNum = pairsNum;
    }

    public String count() {
        return generateBrackets(pairsNum);
    }

    private String generateBrackets(int count) {
        boolean[] str = new boolean[count * 2];
        BigInteger pairsCount = new BigInteger("0");
        addParen(pairsCount, count, count, str, 0);
        return pairsCount.toString();
    }

    private void addParen(BigInteger counter, int leftRem, int rightRem, boolean[] str, int index) {
        if (leftRem < 0 || rightRem < leftRem) return; // Invalid condition, so exit from iteration

        if (leftRem == 0 && rightRem == 0) { // No brackets left, so write set to list
            counter = counter.add(BigInteger.ONE);
        } else {
            str[index] = true; // Add left bracket if they still remain
            addParen(counter, leftRem - 1, rightRem, str, index + 1);

            str[index] = false; // Add right bracket if brackets set is correct
            addParen(counter, leftRem, rightRem - 1, str, index + 1);
        }
    }


}
