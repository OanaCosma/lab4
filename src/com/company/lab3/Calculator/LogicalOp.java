package com.company.lab3.Calculator;

public class LogicalOp {


    public int getHigherNumber(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }


        public static void main(String[] args) {

            String first = “FastTrackIt”;
            String second = “FastTrackIt”;
            if (first.equals(second)) {
                System.out.println(“Learning text comparision !”);
            } else if (!first.equals(second)) {
                System.out.println(“Go try some more”);

            }
        }
}
