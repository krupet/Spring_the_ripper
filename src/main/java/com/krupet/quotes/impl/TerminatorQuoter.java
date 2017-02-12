package com.krupet.quotes.impl;

import com.krupet.quotes.Quoter;
import com.krupet.quotes.annotations.InjectRandomInt;
import lombok.Setter;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Setter
    private String message;

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
