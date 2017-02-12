package com.krupet.quotes.impl;

import com.krupet.quotes.Quoter;
import com.krupet.quotes.annotations.InjectRandomInt;
import com.krupet.quotes.annotations.PostProxy;
import com.krupet.quotes.annotations.Profiling;
import lombok.Setter;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Setter
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1.");
        System.out.println(repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3.");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2.");
        System.out.println(repeat);
    }
}
