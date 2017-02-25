package com.krupet.quotes.impl;

import com.krupet.quotes.Quoter;

public class T1000 extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I am liquid!");
    }
}
